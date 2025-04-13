package com.websockets.WebSocketDemo;

public class ChatMessage {
    private String sender;
    private String content;
    private String type; // JOIN, CHAT, LEAVE
    // Getters and setters

    public String getSender() {
        return sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
