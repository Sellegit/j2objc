package apple.coretext;


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


@Library("CoreText/CoreText.h")
@Mapping("CTFontOrientation")
public final class CTFontOrientation extends ObjCEnum {
    
    @GlobalConstant("kCTFontOrientationDefault")
    public static final long OrientationDefault = 0L;
    @GlobalConstant("kCTFontOrientationHorizontal")
    public static final long OrientationHorizontal = 1L;
    @GlobalConstant("kCTFontOrientationVertical")
    public static final long OrientationVertical = 2L;
    @GlobalConstant("kCTFontDefaultOrientation")
    public static final long DefaultOrientation = 0L;
    @GlobalConstant("kCTFontHorizontalOrientation")
    public static final long HorizontalOrientation = 1L;
    @GlobalConstant("kCTFontVerticalOrientation")
    public static final long VerticalOrientation = 2L;


}
