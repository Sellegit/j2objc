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





@Mapping("CAFUMIDChunk")
public class CAFUMIDChunk 
    extends Struct 
     {

    
    protected CAFUMIDChunk() {}
    
    
    @DotMapping("mBytes")
    public native ByteBuffer getMBytes();
    
    public static native CAFUMIDChunk create(ByteBuffer mBytes) /*-[
        CAFUMIDChunk __new = { .mBytes = mBytes };
        return __new;
    ]-*/;
    public static native CAFUMIDChunk copyWithmBytes(CAFUMIDChunk original, ByteBuffer mBytes) /*-[
        original.mBytes = mBytes;
        return __new;
    ]-*/;

    
}
