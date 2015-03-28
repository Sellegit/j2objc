package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("Photos/Photos.h")
@Mapping("PHImageRequestOptionsResizeMode")
public final class PHImageRequestOptionsResizeMode extends ObjCEnum {
    
    @GlobalConstant("PHImageRequestOptionsResizeModeNone")
    public static final long None = 0L;
    @GlobalConstant("PHImageRequestOptionsResizeModeFast")
    public static final long Fast = 1L;
    @GlobalConstant("PHImageRequestOptionsResizeModeExact")
    public static final long Exact = 2L;


}
