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





@Mapping("CAFFileHeader")
public class CAFFileHeader 
    extends Struct 
     {

    
    protected CAFFileHeader() {}
    
    
    @DotMapping("mFileType")
    public native int getMFileType();
    @DotMapping("mFileVersion")
    public native short getMFileVersion();
    @DotMapping("mFileFlags")
    public native short getMFileFlags();
    
    public static native CAFFileHeader create(int mFileType, short mFileVersion, short mFileFlags) /*-[
        CAFFileHeader __new = { .mFileType = mFileType, .mFileVersion = mFileVersion, .mFileFlags = mFileFlags };
        return __new;
    ]-*/;
    public static native CAFFileHeader copyWithmFileType(CAFFileHeader original, int mFileType) /*-[
        original.mFileType = mFileType;
        return original;
    ]-*/;

    
    public static native CAFFileHeader copyWithmFileVersion(CAFFileHeader original, short mFileVersion) /*-[
        original.mFileVersion = mFileVersion;
        return original;
    ]-*/;

    
    public static native CAFFileHeader copyWithmFileFlags(CAFFileHeader original, short mFileFlags) /*-[
        original.mFileFlags = mFileFlags;
        return original;
    ]-*/;

    
}
