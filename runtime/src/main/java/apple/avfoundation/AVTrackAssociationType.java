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

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVTrackAssociationType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeAudioFallback")
    public static native String AudioFallbackValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeChapterList")
    public static native String ChapterListValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeForcedSubtitlesOnly")
    public static native String ForcedSubtitlesOnlyValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeSelectionFollower")
    public static native String SelectionFollowerValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeTimecode")
    public static native String TimecodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVTrackAssociationTypeMetadataReferent")
    public static native String MetadataReferentValue();

}
