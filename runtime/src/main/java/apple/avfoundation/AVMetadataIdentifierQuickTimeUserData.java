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
@Library("AVFoundation")
public class AVMetadataIdentifierQuickTimeUserData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataChapter")
    public static native NSString ChapterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataComment")
    public static native NSString CommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCreationDate")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDisclaimer")
    public static native NSString DisclaimerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataFullName")
    public static native NSString FullNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataHostComputer")
    public static native NSString HostComputerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataInformation")
    public static native NSString InformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataKeywords")
    public static native NSString KeywordsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataMake")
    public static native NSString MakeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalFormat")
    public static native NSString OriginalFormatValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalSource")
    public static native NSString OriginalSourceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPerformers")
    public static native NSString PerformersValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataProduct")
    public static native NSString ProductValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataSoftware")
    public static native NSString SoftwareValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements")
    public static native NSString SpecialPlaybackRequirementsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTrack")
    public static native NSString TrackValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataWarning")
    public static native NSString WarningValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataWriter")
    public static native NSString WriterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataURLLink")
    public static native NSString URLLinkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataLocationISO6709")
    public static native NSString LocationISO6709Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTrackName")
    public static native NSString TrackNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic")
    public static native NSString TaggedCharacteristicValue();
    
}
