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
public class AVMetadataKey3GPUserData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyPerformer")
    public static native NSString PerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyRecordingYear")
    public static native NSString RecordingYearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyLocation")
    public static native NSString LocationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyTitle")
    public static native NSString TitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyCollection")
    public static native NSString CollectionValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyUserRating")
    public static native NSString UserRatingValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyThumbnail")
    public static native NSString ThumbnailValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyAlbumAndTrack")
    public static native NSString AlbumAndTrackValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyKeywordList")
    public static native NSString KeywordListValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyMediaClassification")
    public static native NSString MediaClassificationValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("AVMetadata3GPUserDataKeyMediaRating")
    public static native NSString MediaRatingValue();
    
}
