package ds.smartwarehouse.managementService;

//required java packages for the program. Depends on your logic.
import java.io.IOException;
import java.util.logging.Logger;

//required grpc package for the server side
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import ds.smartwarehouse.managementService.ManagementGrpc.ManagementImplBase;;


public class ManagementServer extends ManagementImplBase {

	// First we create a logger to show server side logs in the console. logger instance will be used to log different events at the server console.
		private static final Logger logger = Logger.getLogger(ManagementServer.class.getName());

	// Main method would contain the logic to start the server.	For throws keyword refer https://www.javatpoint.com/throw-keyword
	// NOTE: THIS LOGIC WILL BE SAME FOR ALL THE TYPES OF SERVICES
		 public static void main(String[] args) throws IOException, InterruptedException {
			    
			 // The InventoryServer is the current file name/ class name. Using an instance of this class different methods could be invoked by the client.
			 	ManagementServer inventoryserver = new ManagementServer();

			 	// This is the port number where server will be listening to clients. Refer - https://en.wikipedia.org/wiki/Port_(computer_networking) 
			    int port = 50055;
			    
			    // Here, we create a server on the port defined in in variable "port" and attach a service "InventoryServer" (instance of the class) defined above.
			    Server server = ServerBuilder.forPort(port) // Port is defined in line 34
			        .addService(inventoryserver) // Service is defined in line 31
			        .build() // Build the server
			        .start(); // Start the server and keep it running for clients to contact.
			    
			    // Giving a logging information on the server console that server has started
			    logger.info("Server started, listening on " + port);
			    		    
			    // Server will be running until externally terminated.
			    server.awaitTermination();
		 }

		@Override
		public void getHours(equipCode request, StreamObserver<workHours> responseObserver) {
			System.out.print("Cheking equipament...");
			
			// Retrieve the value from the request of the client
			//StringBuilder stb = new StringBuilder(request.getCode());
			int equip = request.getCode();
			
			workHours.Builder reply = workHours.newBuilder();
			
			// LOGIC of THE METHOD 
			// NOTE: YOU MAY NEED TO MODIFY THIS LOGIC HERE.
			
			if (equip == 1) {
				reply.setHours(5);
			}
			
			// Preparing the reply for the client. Here, response is build and with the value (output) computed by above logic.  
			//item reply = item.newBuilder().setName(output).build();
			
			// Sending the reply for each request.
				responseObserver.onNext(reply.build());
				
				responseObserver.onCompleted();
			}
}
