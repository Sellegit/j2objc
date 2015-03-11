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





@Mapping("CAFStringID")
public class CAFStringID 
    extends Struct 
     {

    
    protected CAFStringID() {}
    
    
    @DotMapping("mStringID")
    public native int getMStringID();
    @DotMapping("mStringStartByteOffset")
    public native long getMStringStartByteOffset();
    
    public static native CAFStringID create(int mStringID, long mStringStartByteOffset) /*-[
        CAFStringID __new = { .mStringID = mStringID, .mStringStartByteOffset = mStringStartByteOffset };
        return __new;
    ]-*/;
    public static native CAFStringID copyWithmStringID(CAFStringID original, int mStringID) /*-[
        original.mStringID = mStringID;
        return __new;
    ]-*/;

    
    public static native CAFStringID copyWithmStringStartByteOffset(CAFStringID original, long mStringStartByteOffset) /*-[
        original.mStringStartByteOffset = mStringStartByteOffset;
        return __new;
    ]-*/;

    
}
