package com.bilgeadam.ecommerce;

import com.bilgeadam.proto.EcommerceServiceGrpc;
import com.bilgeadam.proto.GreetingRequest;
import com.bilgeadam.proto.GreetingResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;



@GrpcService
public class EcommerceServiceImpl extends EcommerceServiceGrpc.EcommerceServiceImplBase {


    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        GreetingRequest.newBuilder().setName("Berra").build();

        responseObserver.onNext(GreetingResponse.newBuilder().setMessage("Hello " + request.getName()).build());
        responseObserver.onCompleted();
    }

}
