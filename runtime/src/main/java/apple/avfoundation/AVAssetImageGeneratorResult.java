package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Library("AVFoundation")
@Mapping("AVAssetImageGeneratorResult")
public final class AVAssetImageGeneratorResult extends ObjCEnum {
    
    @GlobalConstant("AVAssetImageGeneratorSucceeded")
    public static final long Succeeded = 0L;
    @GlobalConstant("AVAssetImageGeneratorFailed")
    public static final long Failed = 1L;
    @GlobalConstant("AVAssetImageGeneratorCancelled")
    public static final long Cancelled = 2L;
    

}
