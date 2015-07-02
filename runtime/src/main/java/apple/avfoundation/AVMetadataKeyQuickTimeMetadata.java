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
    public static native String AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyComment")
    public static native String CommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCreationDate")
    public static native String CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDisplayName")
    public static native String DisplayNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyInformation")
    public static native String InformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyKeywords")
    public static native String KeywordsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyAlbum")
    public static native String AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArtwork")
    public static native String ArtworkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeySoftware")
    public static native String SoftwareValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyYear")
    public static native String YearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyGenre")
    public static native String GenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyiXML")
    public static native String iXMLValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationISO6709")
    public static native String LocationISO6709Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyMake")
    public static native String MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyModel")
    public static native String ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPerformer")
    public static native String PerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCameraIdentifier")
    public static native String CameraIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCameraFrameReadoutTime")
    public static native String CameraFrameReadoutTimeValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyTitle")
    public static native String TitleValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyCollectionUser")
    public static native String CollectionUserValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyRatingUser")
    public static native String RatingUserValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationName")
    public static native String LocationNameValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationBody")
    public static native String LocationBodyValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationNote")
    public static native String LocationNoteValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationRole")
    public static native String LocationRoleValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyLocationDate")
    public static native String LocationDateValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirectionFacing")
    public static native String DirectionFacingValue();
    /**
     * @since Available in iOS 4.3 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeMetadataKeyDirectionMotion")
    public static native String DirectionMotionValue();

}
