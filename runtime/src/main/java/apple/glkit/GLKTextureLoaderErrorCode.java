package apple.glkit;


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
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */


@Mapping("GLKTextureLoaderErrorCode")
public final class GLKTextureLoaderErrorCode extends ObjCEnum {
    
    @GlobalConstant("GLKTextureLoaderErrorFileOrURLNotFound")
    public static final long FileOrURLNotFound = 0L;
    @GlobalConstant("GLKTextureLoaderErrorInvalidNSData")
    public static final long InvalidNSData = 1L;
    @GlobalConstant("GLKTextureLoaderErrorInvalidCGImage")
    public static final long InvalidCGImage = 2L;
    @GlobalConstant("GLKTextureLoaderErrorUnknownPathType")
    public static final long UnknownPathType = 3L;
    @GlobalConstant("GLKTextureLoaderErrorUnknownFileType")
    public static final long UnknownFileType = 4L;
    @GlobalConstant("GLKTextureLoaderErrorPVRAtlasUnsupported")
    public static final long PVRAtlasUnsupported = 5L;
    @GlobalConstant("GLKTextureLoaderErrorCubeMapInvalidNumFiles")
    public static final long CubeMapInvalidNumFiles = 6L;
    @GlobalConstant("GLKTextureLoaderErrorCompressedTextureUpload")
    public static final long CompressedTextureUpload = 7L;
    @GlobalConstant("GLKTextureLoaderErrorUncompressedTextureUpload")
    public static final long UncompressedTextureUpload = 8L;
    @GlobalConstant("GLKTextureLoaderErrorUnsupportedCubeMapDimensions")
    public static final long UnsupportedCubeMapDimensions = 9L;
    @GlobalConstant("GLKTextureLoaderErrorUnsupportedBitDepth")
    public static final long UnsupportedBitDepth = 10L;
    @GlobalConstant("GLKTextureLoaderErrorUnsupportedPVRFormat")
    public static final long UnsupportedPVRFormat = 11L;
    @GlobalConstant("GLKTextureLoaderErrorDataPreprocessingFailure")
    public static final long DataPreprocessingFailure = 12L;
    @GlobalConstant("GLKTextureLoaderErrorMipmapUnsupported")
    public static final long MipmapUnsupported = 13L;
    @GlobalConstant("GLKTextureLoaderErrorUnsupportedOrientation")
    public static final long UnsupportedOrientation = 14L;
    @GlobalConstant("GLKTextureLoaderErrorReorientationFailure")
    public static final long ReorientationFailure = 15L;
    @GlobalConstant("GLKTextureLoaderErrorAlphaPremultiplicationFailure")
    public static final long AlphaPremultiplicationFailure = 16L;
    @GlobalConstant("GLKTextureLoaderErrorInvalidEAGLContext")
    public static final long InvalidEAGLContext = 17L;
    @GlobalConstant("GLKTextureLoaderErrorIncompatibleFormatSRGB")
    public static final long IncompatibleFormatSRGB = 18L;
    

}
