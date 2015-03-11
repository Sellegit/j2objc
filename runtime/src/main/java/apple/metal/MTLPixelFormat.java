package apple.metal;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal")
@Mapping("MTLPixelFormat")
public final class MTLPixelFormat extends ObjCEnum {
    
    @GlobalConstant("MTLPixelFormatInvalid")
    public static final long Invalid = 0L;
    @GlobalConstant("MTLPixelFormatA8Unorm")
    public static final long A8Unorm = 1L;
    @GlobalConstant("MTLPixelFormatR8Unorm")
    public static final long R8Unorm = 10L;
    @GlobalConstant("MTLPixelFormatR8Unorm_sRGB")
    public static final long R8Unorm_sRGB = 11L;
    @GlobalConstant("MTLPixelFormatR8Snorm")
    public static final long R8Snorm = 12L;
    @GlobalConstant("MTLPixelFormatR8Uint")
    public static final long R8Uint = 13L;
    @GlobalConstant("MTLPixelFormatR8Sint")
    public static final long R8Sint = 14L;
    @GlobalConstant("MTLPixelFormatR16Unorm")
    public static final long R16Unorm = 20L;
    @GlobalConstant("MTLPixelFormatR16Snorm")
    public static final long R16Snorm = 22L;
    @GlobalConstant("MTLPixelFormatR16Uint")
    public static final long R16Uint = 23L;
    @GlobalConstant("MTLPixelFormatR16Sint")
    public static final long R16Sint = 24L;
    @GlobalConstant("MTLPixelFormatR16Float")
    public static final long R16Float = 25L;
    @GlobalConstant("MTLPixelFormatRG8Unorm")
    public static final long RG8Unorm = 30L;
    @GlobalConstant("MTLPixelFormatRG8Unorm_sRGB")
    public static final long RG8Unorm_sRGB = 31L;
    @GlobalConstant("MTLPixelFormatRG8Snorm")
    public static final long RG8Snorm = 32L;
    @GlobalConstant("MTLPixelFormatRG8Uint")
    public static final long RG8Uint = 33L;
    @GlobalConstant("MTLPixelFormatRG8Sint")
    public static final long RG8Sint = 34L;
    @GlobalConstant("MTLPixelFormatB5G6R5Unorm")
    public static final long B5G6R5Unorm = 40L;
    @GlobalConstant("MTLPixelFormatA1BGR5Unorm")
    public static final long A1BGR5Unorm = 41L;
    @GlobalConstant("MTLPixelFormatABGR4Unorm")
    public static final long ABGR4Unorm = 42L;
    @GlobalConstant("MTLPixelFormatR32Uint")
    public static final long R32Uint = 53L;
    @GlobalConstant("MTLPixelFormatR32Sint")
    public static final long R32Sint = 54L;
    @GlobalConstant("MTLPixelFormatR32Float")
    public static final long R32Float = 55L;
    @GlobalConstant("MTLPixelFormatRG16Unorm")
    public static final long RG16Unorm = 60L;
    @GlobalConstant("MTLPixelFormatRG16Snorm")
    public static final long RG16Snorm = 62L;
    @GlobalConstant("MTLPixelFormatRG16Uint")
    public static final long RG16Uint = 63L;
    @GlobalConstant("MTLPixelFormatRG16Sint")
    public static final long RG16Sint = 64L;
    @GlobalConstant("MTLPixelFormatRG16Float")
    public static final long RG16Float = 65L;
    @GlobalConstant("MTLPixelFormatRGBA8Unorm")
    public static final long RGBA8Unorm = 70L;
    @GlobalConstant("MTLPixelFormatRGBA8Unorm_sRGB")
    public static final long RGBA8Unorm_sRGB = 71L;
    @GlobalConstant("MTLPixelFormatRGBA8Snorm")
    public static final long RGBA8Snorm = 72L;
    @GlobalConstant("MTLPixelFormatRGBA8Uint")
    public static final long RGBA8Uint = 73L;
    @GlobalConstant("MTLPixelFormatRGBA8Sint")
    public static final long RGBA8Sint = 74L;
    @GlobalConstant("MTLPixelFormatBGRA8Unorm")
    public static final long BGRA8Unorm = 80L;
    @GlobalConstant("MTLPixelFormatBGRA8Unorm_sRGB")
    public static final long BGRA8Unorm_sRGB = 81L;
    @GlobalConstant("MTLPixelFormatRGB10A2Unorm")
    public static final long RGB10A2Unorm = 90L;
    @GlobalConstant("MTLPixelFormatRGB10A2Uint")
    public static final long RGB10A2Uint = 91L;
    @GlobalConstant("MTLPixelFormatRG11B10Float")
    public static final long RG11B10Float = 92L;
    @GlobalConstant("MTLPixelFormatRGB9E5Float")
    public static final long RGB9E5Float = 93L;
    @GlobalConstant("MTLPixelFormatRG32Uint")
    public static final long RG32Uint = 103L;
    @GlobalConstant("MTLPixelFormatRG32Sint")
    public static final long RG32Sint = 104L;
    @GlobalConstant("MTLPixelFormatRG32Float")
    public static final long RG32Float = 105L;
    @GlobalConstant("MTLPixelFormatRGBA16Unorm")
    public static final long RGBA16Unorm = 110L;
    @GlobalConstant("MTLPixelFormatRGBA16Snorm")
    public static final long RGBA16Snorm = 112L;
    @GlobalConstant("MTLPixelFormatRGBA16Uint")
    public static final long RGBA16Uint = 113L;
    @GlobalConstant("MTLPixelFormatRGBA16Sint")
    public static final long RGBA16Sint = 114L;
    @GlobalConstant("MTLPixelFormatRGBA16Float")
    public static final long RGBA16Float = 115L;
    @GlobalConstant("MTLPixelFormatRGBA32Uint")
    public static final long RGBA32Uint = 123L;
    @GlobalConstant("MTLPixelFormatRGBA32Sint")
    public static final long RGBA32Sint = 124L;
    @GlobalConstant("MTLPixelFormatRGBA32Float")
    public static final long RGBA32Float = 125L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGB_2BPP")
    public static final long PVRTC_RGB_2BPP = 160L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGB_2BPP_sRGB")
    public static final long PVRTC_RGB_2BPP_sRGB = 161L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGB_4BPP")
    public static final long PVRTC_RGB_4BPP = 162L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGB_4BPP_sRGB")
    public static final long PVRTC_RGB_4BPP_sRGB = 163L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGBA_2BPP")
    public static final long PVRTC_RGBA_2BPP = 164L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGBA_2BPP_sRGB")
    public static final long PVRTC_RGBA_2BPP_sRGB = 165L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGBA_4BPP")
    public static final long PVRTC_RGBA_4BPP = 166L;
    @GlobalConstant("MTLPixelFormatPVRTC_RGBA_4BPP_sRGB")
    public static final long PVRTC_RGBA_4BPP_sRGB = 167L;
    @GlobalConstant("MTLPixelFormatEAC_R11Unorm")
    public static final long EAC_R11Unorm = 170L;
    @GlobalConstant("MTLPixelFormatEAC_R11Snorm")
    public static final long EAC_R11Snorm = 172L;
    @GlobalConstant("MTLPixelFormatEAC_RG11Unorm")
    public static final long EAC_RG11Unorm = 174L;
    @GlobalConstant("MTLPixelFormatEAC_RG11Snorm")
    public static final long EAC_RG11Snorm = 176L;
    @GlobalConstant("MTLPixelFormatEAC_RGBA8")
    public static final long EAC_RGBA8 = 178L;
    @GlobalConstant("MTLPixelFormatEAC_RGBA8_sRGB")
    public static final long EAC_RGBA8_sRGB = 179L;
    @GlobalConstant("MTLPixelFormatETC2_RGB8")
    public static final long ETC2_RGB8 = 180L;
    @GlobalConstant("MTLPixelFormatETC2_RGB8_sRGB")
    public static final long ETC2_RGB8_sRGB = 181L;
    @GlobalConstant("MTLPixelFormatETC2_RGB8A1")
    public static final long ETC2_RGB8A1 = 182L;
    @GlobalConstant("MTLPixelFormatETC2_RGB8A1_sRGB")
    public static final long ETC2_RGB8A1_sRGB = 183L;
    @GlobalConstant("MTLPixelFormatASTC_4x4_sRGB")
    public static final long ASTC_4x4_sRGB = 186L;
    @GlobalConstant("MTLPixelFormatASTC_5x4_sRGB")
    public static final long ASTC_5x4_sRGB = 187L;
    @GlobalConstant("MTLPixelFormatASTC_5x5_sRGB")
    public static final long ASTC_5x5_sRGB = 188L;
    @GlobalConstant("MTLPixelFormatASTC_6x5_sRGB")
    public static final long ASTC_6x5_sRGB = 189L;
    @GlobalConstant("MTLPixelFormatASTC_6x6_sRGB")
    public static final long ASTC_6x6_sRGB = 190L;
    @GlobalConstant("MTLPixelFormatASTC_8x5_sRGB")
    public static final long ASTC_8x5_sRGB = 192L;
    @GlobalConstant("MTLPixelFormatASTC_8x6_sRGB")
    public static final long ASTC_8x6_sRGB = 193L;
    @GlobalConstant("MTLPixelFormatASTC_8x8_sRGB")
    public static final long ASTC_8x8_sRGB = 194L;
    @GlobalConstant("MTLPixelFormatASTC_10x5_sRGB")
    public static final long ASTC_10x5_sRGB = 195L;
    @GlobalConstant("MTLPixelFormatASTC_10x6_sRGB")
    public static final long ASTC_10x6_sRGB = 196L;
    @GlobalConstant("MTLPixelFormatASTC_10x8_sRGB")
    public static final long ASTC_10x8_sRGB = 197L;
    @GlobalConstant("MTLPixelFormatASTC_10x10_sRGB")
    public static final long ASTC_10x10_sRGB = 198L;
    @GlobalConstant("MTLPixelFormatASTC_12x10_sRGB")
    public static final long ASTC_12x10_sRGB = 199L;
    @GlobalConstant("MTLPixelFormatASTC_12x12_sRGB")
    public static final long ASTC_12x12_sRGB = 200L;
    @GlobalConstant("MTLPixelFormatASTC_4x4_LDR")
    public static final long ASTC_4x4_LDR = 204L;
    @GlobalConstant("MTLPixelFormatASTC_5x4_LDR")
    public static final long ASTC_5x4_LDR = 205L;
    @GlobalConstant("MTLPixelFormatASTC_5x5_LDR")
    public static final long ASTC_5x5_LDR = 206L;
    @GlobalConstant("MTLPixelFormatASTC_6x5_LDR")
    public static final long ASTC_6x5_LDR = 207L;
    @GlobalConstant("MTLPixelFormatASTC_6x6_LDR")
    public static final long ASTC_6x6_LDR = 208L;
    @GlobalConstant("MTLPixelFormatASTC_8x5_LDR")
    public static final long ASTC_8x5_LDR = 210L;
    @GlobalConstant("MTLPixelFormatASTC_8x6_LDR")
    public static final long ASTC_8x6_LDR = 211L;
    @GlobalConstant("MTLPixelFormatASTC_8x8_LDR")
    public static final long ASTC_8x8_LDR = 212L;
    @GlobalConstant("MTLPixelFormatASTC_10x5_LDR")
    public static final long ASTC_10x5_LDR = 213L;
    @GlobalConstant("MTLPixelFormatASTC_10x6_LDR")
    public static final long ASTC_10x6_LDR = 214L;
    @GlobalConstant("MTLPixelFormatASTC_10x8_LDR")
    public static final long ASTC_10x8_LDR = 215L;
    @GlobalConstant("MTLPixelFormatASTC_10x10_LDR")
    public static final long ASTC_10x10_LDR = 216L;
    @GlobalConstant("MTLPixelFormatASTC_12x10_LDR")
    public static final long ASTC_12x10_LDR = 217L;
    @GlobalConstant("MTLPixelFormatASTC_12x12_LDR")
    public static final long ASTC_12x12_LDR = 218L;
    @GlobalConstant("MTLPixelFormatGBGR422")
    public static final long GBGR422 = 240L;
    @GlobalConstant("MTLPixelFormatBGRG422")
    public static final long BGRG422 = 241L;
    @GlobalConstant("MTLPixelFormatDepth32Float")
    public static final long Depth32Float = 252L;
    @GlobalConstant("MTLPixelFormatStencil8")
    public static final long Stencil8 = 253L;
    

}
