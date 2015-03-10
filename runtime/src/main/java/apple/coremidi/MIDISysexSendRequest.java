package apple.coremidi;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;





@Mapping("MIDISysexSendRequest")
public class MIDISysexSendRequest 
    extends Struct 
     {

    
    protected MIDISysexSendRequest() {}
    
    
    @DotMapping("destination")
    public native MIDIEndpoint getDestination();
    @DotMapping("data")
    public native Todo getData();
    @DotMapping("bytesToSend")
    public native int getBytesToSend();
    @DotMapping("complete")
    public native boolean getComplete();
    @DotMapping("reserved")
    public native ByteBuffer getReserved();
    @DotMapping("completionRefCon")
    public native Todo getCompletionRefCon();
    
    public static native MIDISysexSendRequest copyWithdestination(MIDISysexSendRequest original, MIDIEndpoint destination) /*-[
        original.destination = destination;
        return __new;
    ]-*/;

    
    public static native MIDISysexSendRequest copyWithdata(MIDISysexSendRequest original, Todo data) /*-[
        original.data = data;
        return __new;
    ]-*/;

    
    public static native MIDISysexSendRequest copyWithbytesToSend(MIDISysexSendRequest original, int bytesToSend) /*-[
        original.bytesToSend = bytesToSend;
        return __new;
    ]-*/;

    
    public static native MIDISysexSendRequest copyWithcomplete(MIDISysexSendRequest original, boolean complete) /*-[
        original.complete = complete;
        return __new;
    ]-*/;

    
    public static native MIDISysexSendRequest copyWithreserved(MIDISysexSendRequest original, ByteBuffer reserved) /*-[
        original.reserved = reserved;
        return __new;
    ]-*/;

    
    
    public static native MIDISysexSendRequest copyWithcompletionRefCon(MIDISysexSendRequest original, Todo completionRefCon) /*-[
        original.completionRefCon = completionRefCon;
        return __new;
    ]-*/;

    
}
