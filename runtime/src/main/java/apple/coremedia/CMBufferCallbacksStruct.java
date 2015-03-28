package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


@Mapping("CMBufferCallbacksStruct") @Library("CoreMedia/CoreMedia.h")
 class CMBufferCallbacksStruct 
    extends Struct 
     {

    
    private CMBufferCallbacksStruct() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("dataBecameReadyNotification")
    public native CFString getDataBecameReadyNotification();

    
}
