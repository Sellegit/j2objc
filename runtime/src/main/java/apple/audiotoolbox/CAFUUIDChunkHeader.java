package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("CAFUUIDChunkHeader")
public class CAFUUIDChunkHeader 
    extends Struct 
     {

    
    protected CAFUUIDChunkHeader() {}
    
    
    @DotMapping("mHeader")
    public native CAFChunkHeader getMHeader();
    @DotMapping("mUUID")
    public native ByteBuffer getMUUID();
    
    public static native CAFUUIDChunkHeader create(CAFChunkHeader mHeader, ByteBuffer mUUID) /*-[
        CAFUUIDChunkHeader __new = { .mHeader = mHeader, .mUUID = mUUID };
        return __new;
    ]-*/;
    public static native CAFUUIDChunkHeader copyWithmHeader(CAFUUIDChunkHeader original, CAFChunkHeader mHeader) /*-[
        original.mHeader = mHeader;
        return __new;
    ]-*/;

    
    public static native CAFUUIDChunkHeader copyWithmUUID(CAFUUIDChunkHeader original, ByteBuffer mUUID) /*-[
        original.mUUID = mUUID;
        return __new;
    ]-*/;

    
}
