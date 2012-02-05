package org.menacheri.communication;

import java.net.SocketAddress;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.socket.DatagramChannel;

public class NettyUDPMessage implements INettyMessage
{
	private ChannelBuffer buffer;
	private DatagramChannel channel;
	private SocketAddress remoteAddress;
	private static final int deliveryGuaranty = DeliveryGuaranty.FAST;
	
	public NettyUDPMessage()
	{
		
	}
	
	@Override
	public ChannelBuffer getMessage()
	{
		return buffer;
	}
	
	@Override
	public ChannelBuffer getChannelBuffer()
	{
		return buffer;
	}
	
	@Override
	public Channel getChannel()
	{
		return channel;
	}

	@Override
	public SocketAddress getSocketAddress()
	{
		return remoteAddress;
	}

	@Override
	public INettyMessage setChannel(Channel channel)
	{
		this.channel = (DatagramChannel)channel;
		return this;
		
	}

	@Override
	public INettyMessage setChannelBuffer(ChannelBuffer buffer)
	{
		this.buffer = buffer;
		return this;
	}

	@Override
	public INettyMessage setSocketAddress(SocketAddress remoteAddress)
	{
		this.remoteAddress = remoteAddress;
		return this;
	}

	@Override
	public int getDeliveryGuaranty()
	{
		return deliveryGuaranty;
	}

}