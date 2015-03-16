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





@Mapping("MusicEventUserData") @Library("AudioToolbox/AudioToolbox.h")
public class MusicEventUserData 
    extends Struct 
     {

    
    protected MusicEventUserData() {}
    
    
    @DotMapping("length")
    public native int getLength();
    @DotMapping("data")
    public native ByteBuffer getData();
    
    public static native MusicEventUserData create(int length, ByteBuffer data) /*-[
        MusicEventUserData __new = { .length = length, .data = data };
        return __new;
    ]-*/;
    public static native MusicEventUserData copyWithlength(MusicEventUserData original, int length) /*-[
        MusicEventUserData __new = { .length = length, .data = original.data };
        return __new;
    ]-*/;

    
    public static native MusicEventUserData copyWithdata(MusicEventUserData original, ByteBuffer data) /*-[
        MusicEventUserData __new = { .length = original.length, .data = data };
        return __new;
    ]-*/;

    
}
