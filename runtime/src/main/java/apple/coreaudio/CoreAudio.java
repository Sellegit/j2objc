package apple.coreaudio;


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

/*<javadoc>*/
/*</javadoc>*/

public class CoreAudio 
    extends Object 
     {

    
    public static final int AudioUnitSampleFractionBits = 24;
    public static final int AudioStreamAnyRate = 0;
    public static final int AudioFormatFlagIsFloat = 1;
    public static final int AudioFormatFlagIsBigEndian = 2;
    public static final int AudioFormatFlagIsSignedInteger = 4;
    public static final int AudioFormatFlagIsPacked = 8;
    public static final int AudioFormatFlagIsAlignedHigh = 16;
    public static final int AudioFormatFlagIsNonInterleaved = 32;
    public static final int AudioFormatFlagIsNonMixable = 64;
    public static final int AudioFormatFlagsAreAllClear = -2147483648;
    public static final int LinearPCMFormatFlagIsFloat = 1;
    public static final int LinearPCMFormatFlagIsBigEndian = 2;
    public static final int LinearPCMFormatFlagIsSignedInteger = 4;
    public static final int LinearPCMFormatFlagIsPacked = 8;
    public static final int LinearPCMFormatFlagIsAlignedHigh = 16;
    public static final int LinearPCMFormatFlagIsNonInterleaved = 32;
    public static final int LinearPCMFormatFlagIsNonMixable = 64;
    public static final int LinearPCMFormatFlagsSampleFractionShift = 7;
    public static final int LinearPCMFormatFlagsSampleFractionMask = 8064;
    public static final int LinearPCMFormatFlagsAreAllClear = -2147483648;
    public static final int AppleLosslessFormatFlag_16BitSourceData = 1;
    public static final int AppleLosslessFormatFlag_20BitSourceData = 2;
    public static final int AppleLosslessFormatFlag_24BitSourceData = 3;
    public static final int AppleLosslessFormatFlag_32BitSourceData = 4;
    public static final int AudioFormatFlagsNativeEndian = 0;
    public static final int AudioFormatFlagsCanonical = 12;
    public static final int AudioFormatFlagsAudioUnitCanonical = 3116;
    public static final int AudioFormatFlagsNativeFloatPacked = 9;
    public static final int AudioTimeStampSampleTimeValid = 1;
    public static final int AudioTimeStampHostTimeValid = 2;
    public static final int AudioTimeStampRateScalarValid = 4;
    public static final int AudioTimeStampWordClockTimeValid = 8;
    public static final int AudioTimeStampSMPTETimeValid = 16;
    public static final int AudioTimeStampSampleHostTimeValid = 3;
    public static final int AudioChannelCoordinates_LeftRight = 0;
    public static final int AudioChannelCoordinates_BackFront = 1;
    public static final int AudioChannelCoordinates_DownUp = 2;
    public static final int AudioChannelCoordinates_Azimuth = 0;
    public static final int AudioChannelCoordinates_Elevation = 1;
    public static final int AudioChannelCoordinates_Distance = 2;
    public static final int MPEG4Object_AAC_Main = 1;
    public static final int MPEG4Object_AAC_LC = 2;
    public static final int MPEG4Object_AAC_SSR = 3;
    public static final int MPEG4Object_AAC_LTP = 4;
    public static final int MPEG4Object_AAC_SBR = 5;
    public static final int MPEG4Object_AAC_Scalable = 6;
    public static final int MPEG4Object_TwinVQ = 7;
    public static final int MPEG4Object_CELP = 8;
    public static final int MPEG4Object_HVXC = 9;

    
    
    
    
}
