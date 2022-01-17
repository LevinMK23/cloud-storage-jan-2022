package com.geekbrains.cloud.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerTest {

    public static void main(String[] args) throws IOException {
        NioEchoServer server = new NioEchoServer(new TelnetTerminalProcessor());
        server.start();
    }
}
