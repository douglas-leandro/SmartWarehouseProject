package ds.smartwarehouse.managementService;

import java.util.logging.Logger;

import ds.smartwarehouse.inventoryservice.InventoryClient;
import ds.smartwarehouse.inventoryservice.inventoryServiceGrpc;
import ds.smartwarehouse.inventoryservice.item;
import ds.smartwarehouse.inventoryservice.itemCode;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ManagementClient {
	
	private static  Logger logger = Logger.getLogger(InventoryClient.class.getName());

	// Creating stubs for establishing the connection with server.
	// Blocking stub
	private static ManagementGrpc.ManagementBlockingStub blockingStub;
	// Asynch stub
	private static ManagementGrpc.ManagementStub asyncStub;
	
	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
	// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
		// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = ManagementGrpc.newBlockingStub(channel);
		asyncStub = ManagementGrpc.newStub(channel);

		// Unary RPC call	
		getHours();

		// Closing the channel once message has been passed.		
		channel.shutdown();

	}
	
	//unary RPC
	public static void getHours() {
		// First creating a request message. Here, the message contains a string in setVal
		equipCode req = equipCode.newBuilder().setCode(1).build();
		//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
		workHours response = blockingStub.getHours(req);

		//response contains the output from the server side. Here, we are printing the value contained by response.
		System.out.println("Hours of use:");
		System.out.println(response.getHours());
	}

}
