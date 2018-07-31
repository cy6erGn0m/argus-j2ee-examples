package ru.levelp.weld;

public class AppServer {
    private String name;
    private String hostPort;

    public AppServer(String name, String hostPort) {
        this.name = name;
        this.hostPort = hostPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostPort() {
        return hostPort;
    }

    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }
}
