package edu.school21.chat.models;

import java.sql.Timestamp;
import java.util.Objects;

public class Message {
    private final long id;
    private final User author;
    private final Chatroom room;
    private final String text;
    private final Timestamp time;

    public Message(long id, User author, Chatroom room, String text, Timestamp time) {
        this.id = id;
        this.author = author;
        this.room = room;
        this.text = text;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Chatroom getRoom() {
        return room;
    }

    public String getText() {
        return text;
    }

    public Timestamp getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id && author.equals(message.author)
                && room.equals(message.room) && text.equals(message.text)
                && time.equals(message.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, room, text, time);
    }

    @Override
    public String toString() {
        return "Message : {\n  id=" + id + ",\n  author=" + author
                + ",\n  room=" + room + ",\n  text=\"" + text
                + "\",\n  dateTime=" + time + "\n}";
    }
}
