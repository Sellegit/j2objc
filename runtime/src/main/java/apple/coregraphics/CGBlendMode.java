package apple.coregraphics;


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
import apple.uikit.*;





@Library("CoreGraphics")
@Mapping("CGBlendMode")
public final class CGBlendMode extends ObjCEnum {
    
    @GlobalConstant("kCGBlendModeNormal")
    public static final long Normal = 0L;
    @GlobalConstant("kCGBlendModeMultiply")
    public static final long Multiply = 1L;
    @GlobalConstant("kCGBlendModeScreen")
    public static final long Screen = 2L;
    @GlobalConstant("kCGBlendModeOverlay")
    public static final long Overlay = 3L;
    @GlobalConstant("kCGBlendModeDarken")
    public static final long Darken = 4L;
    @GlobalConstant("kCGBlendModeLighten")
    public static final long Lighten = 5L;
    @GlobalConstant("kCGBlendModeColorDodge")
    public static final long ColorDodge = 6L;
    @GlobalConstant("kCGBlendModeColorBurn")
    public static final long ColorBurn = 7L;
    @GlobalConstant("kCGBlendModeSoftLight")
    public static final long SoftLight = 8L;
    @GlobalConstant("kCGBlendModeHardLight")
    public static final long HardLight = 9L;
    @GlobalConstant("kCGBlendModeDifference")
    public static final long Difference = 10L;
    @GlobalConstant("kCGBlendModeExclusion")
    public static final long Exclusion = 11L;
    @GlobalConstant("kCGBlendModeHue")
    public static final long Hue = 12L;
    @GlobalConstant("kCGBlendModeSaturation")
    public static final long Saturation = 13L;
    @GlobalConstant("kCGBlendModeColor")
    public static final long Color = 14L;
    @GlobalConstant("kCGBlendModeLuminosity")
    public static final long Luminosity = 15L;
    @GlobalConstant("kCGBlendModeClear")
    public static final long Clear = 16L;
    @GlobalConstant("kCGBlendModeCopy")
    public static final long Copy = 17L;
    @GlobalConstant("kCGBlendModeSourceIn")
    public static final long SourceIn = 18L;
    @GlobalConstant("kCGBlendModeSourceOut")
    public static final long SourceOut = 19L;
    @GlobalConstant("kCGBlendModeSourceAtop")
    public static final long SourceAtop = 20L;
    @GlobalConstant("kCGBlendModeDestinationOver")
    public static final long DestinationOver = 21L;
    @GlobalConstant("kCGBlendModeDestinationIn")
    public static final long DestinationIn = 22L;
    @GlobalConstant("kCGBlendModeDestinationOut")
    public static final long DestinationOut = 23L;
    @GlobalConstant("kCGBlendModeDestinationAtop")
    public static final long DestinationAtop = 24L;
    @GlobalConstant("kCGBlendModeXOR")
    public static final long XOR = 25L;
    @GlobalConstant("kCGBlendModePlusDarker")
    public static final long PlusDarker = 26L;
    @GlobalConstant("kCGBlendModePlusLighter")
    public static final long PlusLighter = 27L;
    

}
