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
    public static native String AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataComment")
    public static native String CommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCreationDate")
    public static native String CreationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDisplayName")
    public static native String DisplayNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataInformation")
    public static native String InformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataKeywords")
    public static native String KeywordsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataAlbum")
    public static native String AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArtwork")
    public static native String ArtworkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataSoftware")
    public static native String SoftwareValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataYear")
    public static native String YearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataGenre")
    public static native String GenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataiXML")
    public static native String iXMLValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationISO6709")
    public static native String LocationISO6709Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataMake")
    public static native String MakeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataModel")
    public static native String ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPerformer")
    public static native String PerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCameraIdentifier")
    public static native String CameraIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCameraFrameReadoutTime")
    public static native String CameraFrameReadoutTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataTitle")
    public static native String TitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataCollectionUser")
    public static native String CollectionUserValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataRatingUser")
    public static native String RatingUserValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationName")
    public static native String LocationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationBody")
    public static native String LocationBodyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationNote")
    public static native String LocationNoteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationRole")
    public static native String LocationRoleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataLocationDate")
    public static native String LocationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirectionFacing")
    public static native String DirectionFacingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataDirectionMotion")
    public static native String DirectionMotionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeMetadataPreferredAffineTransform")
    public static native String PreferredAffineTransformValue();

}
