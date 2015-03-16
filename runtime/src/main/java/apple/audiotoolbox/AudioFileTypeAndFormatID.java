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





@Mapping("AudioFileTypeAndFormatID") @Library("AudioToolbox/AudioToolbox.h")
public class AudioFileTypeAndFormatID 
    extends Struct 
     {

    
    protected AudioFileTypeAndFormatID() {}
    
    
    @DotMapping("mFileType")
    public native int getMFileType();
    @DotMapping("mFormatID")
    public native int getMFormatID();
    
    public static native AudioFileTypeAndFormatID create(int mFileType, int mFormatID) /*-[
        AudioFileTypeAndFormatID __new = { .mFileType = mFileType, .mFormatID = mFormatID };
        return __new;
    ]-*/;
    public static native AudioFileTypeAndFormatID copyWithmFileType(AudioFileTypeAndFormatID original, int mFileType) /*-[
        AudioFileTypeAndFormatID __new = { .mFileType = mFileType, .mFormatID = original.mFormatID };
        return __new;
    ]-*/;

    
    public static native AudioFileTypeAndFormatID copyWithmFormatID(AudioFileTypeAndFormatID original, int mFormatID) /*-[
        AudioFileTypeAndFormatID __new = { .mFileType = original.mFileType, .mFormatID = mFormatID };
        return __new;
    ]-*/;

    
}
