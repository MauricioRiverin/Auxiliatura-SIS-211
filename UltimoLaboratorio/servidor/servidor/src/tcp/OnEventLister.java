package tcp;

public interface OnEventLister {
    public void join(String channelName, ServerClientSocket client);
    
}

