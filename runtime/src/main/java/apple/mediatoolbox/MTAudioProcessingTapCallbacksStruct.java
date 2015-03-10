package apple.mediatoolbox;


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
import apple.coremedia.*;
import apple.coreaudio.*;





@Mapping("MTAudioProcessingTapCallbacksStruct")
 class MTAudioProcessingTapCallbacksStruct 
    extends Struct 
     {

    
    protected MTAudioProcessingTapCallbacksStruct() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("clientInfo")
    public native Todo getClientInfo();
    
    public static native MTAudioProcessingTapCallbacksStruct copyWithversion(MTAudioProcessingTapCallbacksStruct original, int version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    public static native MTAudioProcessingTapCallbacksStruct copyWithclientInfo(MTAudioProcessingTapCallbacksStruct original, Todo clientInfo) /*-[
        original.clientInfo = clientInfo;
        return __new;
    ]-*/;

    
    
    
    
    
    
}
