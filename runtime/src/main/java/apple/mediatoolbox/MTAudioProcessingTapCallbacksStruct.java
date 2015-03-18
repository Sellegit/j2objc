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





@Mapping("MTAudioProcessingTapCallbacksStruct") @Library("MediaToolbox/MediaToolbox.h")
 class MTAudioProcessingTapCallbacksStruct 
    extends Struct 
     {

    
    private MTAudioProcessingTapCallbacksStruct() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("clientInfo")
    public native Todo getClientInfo();
    
    
}
