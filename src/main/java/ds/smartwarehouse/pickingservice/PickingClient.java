package ds.smartwarehouse.pickingservice;

//required java packages for the program. Depends on your logic.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class PickingClient {
	
	private static  Logger logger = Logger.getLogger(PickingClient.class.getName());

	// Creating stubs for establishing the connection with server.
				// Blocking stub
	private static PickingGrpc.PickingBlockingStub blockingStub;
	// Asynch stub
	private static PickingGrpc.PickingStub asyncStub;
	
	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50058).
		// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50058).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = PickingGrpc.newBlockingStub(channel);
		asyncStub = PickingGrpc.newStub(channel);

		//bidirectional streaming
		//reverseStream();
		
		getOrder();

		// Closing the channel once message has been passed.		
		channel.shutdown();

	}
	
	public static void getOrder() {
		
		StreamObserver<confirmOrder> responseObserver = new StreamObserver<confirmOrder>() {

			@Override
			public void onNext(confirmOrder value) {
				if (confirmOrder) {
					
					System.out.println("Order received");
				}
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				System.out.println("completed ");

			}

		};

		// Here, we are calling the Remote getOrder method. Using onNext, client sends a stream of messages.
		StreamObserver<orderList> requestObserver = asyncStub.getOrder(responseObserver);

		try {

			requestObserver.onNext(orderList.newBuilder().setList("Product1").build());
			requestObserver.onNext(orderList.newBuilder().setList("Product2").build());
			requestObserver.onNext(orderList.newBuilder().setList("Product3").build());
			requestObserver.onNext(orderList.newBuilder().setList("Product4").build());

			System.out.println("SENDING MESSAGES");

			// Mark the end of requests
			requestObserver.onCompleted();


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

		
	}
	
	

}
