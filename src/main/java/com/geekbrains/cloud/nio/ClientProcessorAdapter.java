package com.geekbrains.cloud.nio;

import java.io.IOException;
import java.nio.channels.SocketChannel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClientProcessorAdapter implements ClientProcessor {

    @Override
    public void onMessageReceived(String message, SocketChannel channel) throws IOException {
        log.debug("received: {}", message);
    }

    @Override
    public void onClientDisconnected(SocketChannel channel) throws IOException {
        log.debug("client disconnected");
    }

    @Override
    public void onClientAccepted(SocketChannel acceptedChannel) throws IOException {
        log.debug("client connected");
    }

    @Override
    public void onExceptionCaught(Throwable ex) throws IOException {
        log.error("e=", ex);
    }
}