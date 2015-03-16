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
public class AVMetadataKeyQuickTimeMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyComment")
    public static native NSString CommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCreationDate")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDisplayName")
    public static native NSString DisplayNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyInformation")
    public static native NSString InformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyKeywords")
    public static native NSString KeywordsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArtwork")
    public static native NSString ArtworkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeySoftware")
    public static native NSString SoftwareValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyYear")
    public static native NSString YearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyiXML")
    public static native NSString iXMLValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationISO6709")
    public static native NSString LocationISO6709Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyMake")
    public static native NSString MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPerformer")
    public static native NSString PerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCameraIdentifier")
    public static native NSString CameraIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime")
    public static native NSString CameraFrameReadoutTimeValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyTitle")
    public static native NSString TitleValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCollectionUser")
    public static native NSString CollectionUserValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyRatingUser")
    public static native NSString RatingUserValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationName")
    public static native NSString LocationNameValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationBody")
    public static native NSString LocationBodyValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationNote")
    public static native NSString LocationNoteValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationRole")
    public static native NSString LocationRoleValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationDate")
    public static native NSString LocationDateValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirectionFacing")
    public static native NSString DirectionFacingValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirectionMotion")
    public static native NSString DirectionMotionValue();
    
}
