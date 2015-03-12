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





@Mapping("CMBufferCallbacksStruct")
 class CMBufferCallbacksStruct 
    extends Struct 
     {

    
    protected CMBufferCallbacksStruct() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("dataBecameReadyNotification")
    public native String getDataBecameReadyNotification();
    
    public static native CMBufferCallbacksStruct copyWithversion(CMBufferCallbacksStruct original, int version) /*-[
        original.version = version;
        return original;
    ]-*/;

    
    
    
    
    
    
    
    public static native CMBufferCallbacksStruct copyWithdataBecameReadyNotification(CMBufferCallbacksStruct original, String dataBecameReadyNotification) /*-[
        original.dataBecameReadyNotification = dataBecameReadyNotification;
        return original;
    ]-*/;

    
    
}
