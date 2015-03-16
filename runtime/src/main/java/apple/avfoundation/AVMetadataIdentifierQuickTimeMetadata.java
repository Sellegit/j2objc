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
public class AVMetadataIdentifierQuickTimeMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataComment")
    public static native NSString CommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCreationDate")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDisplayName")
    public static native NSString DisplayNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataInformation")
    public static native NSString InformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataKeywords")
    public static native NSString KeywordsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArtwork")
    public static native NSString ArtworkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataSoftware")
    public static native NSString SoftwareValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataYear")
    public static native NSString YearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataiXML")
    public static native NSString iXMLValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationISO6709")
    public static native NSString LocationISO6709Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataMake")
    public static native NSString MakeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPerformer")
    public static native NSString PerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCameraIdentifier")
    public static native NSString CameraIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime")
    public static native NSString CameraFrameReadoutTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataTitle")
    public static native NSString TitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCollectionUser")
    public static native NSString CollectionUserValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataRatingUser")
    public static native NSString RatingUserValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationName")
    public static native NSString LocationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationBody")
    public static native NSString LocationBodyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationNote")
    public static native NSString LocationNoteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationRole")
    public static native NSString LocationRoleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationDate")
    public static native NSString LocationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirectionFacing")
    public static native NSString DirectionFacingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirectionMotion")
    public static native NSString DirectionMotionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform")
    public static native NSString PreferredAffineTransformValue();
    
}
