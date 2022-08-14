package ds.smartwarehouse.inventoryservice;

import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InventoryClient {	
	// First we create a logger to show client side logs in the console. logger instance will be used to log different events at the client console.
	// This is optional. Could be used if needed.
	private static  Logger logger = Logger.getLogger(InventoryClient.class.getName());

	// Creating stubs for establishing the connection with server.
	// Blocking stub
	private static inventoryServiceGrpc.inventoryServiceBlockingStub blockingStub;
	// Asynch stub
	private static inventoryServiceGrpc.inventoryServiceStub asyncStub;
	
	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
	// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
		// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = inventoryServiceGrpc.newBlockingStub(channel);
		asyncStub = inventoryServiceGrpc.newStub(channel);

		// Unary RPC call	
		searchItem();

		// Closing the channel once message has been passed.		
		channel.shutdown();

	}
	
	//unary RPC
	public static void searchItem() {
		// First creating a request message. Here, the message contains a string in setVal
		itemCode req = itemCode.newBuilder().setCode(1).build();
		//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
		item response = blockingStub.searchItem(req);

		//response contains the output from the server side. Here, we are printing the value contained by response. 
		System.out.println(response.getName());
	}
	

}
