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
public class AVMetadataIdentifierQuickTimeUserData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataAlbum")
    public static native String AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataAuthor")
    public static native String AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataChapter")
    public static native String ChapterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataComment")
    public static native String CommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCreationDate")
    public static native String CreationDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataDisclaimer")
    public static native String DisclaimerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataFullName")
    public static native String FullNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataGenre")
    public static native String GenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataHostComputer")
    public static native String HostComputerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataInformation")
    public static native String InformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataKeywords")
    public static native String KeywordsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataMake")
    public static native String MakeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataModel")
    public static native String ModelValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalFormat")
    public static native String OriginalFormatValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataOriginalSource")
    public static native String OriginalSourceValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPerformers")
    public static native String PerformersValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataProduct")
    public static native String ProductValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataSoftware")
    public static native String SoftwareValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataSpecialPlaybackRequirements")
    public static native String SpecialPlaybackRequirementsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTrack")
    public static native String TrackValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataWarning")
    public static native String WarningValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataWriter")
    public static native String WriterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataURLLink")
    public static native String URLLinkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataLocationISO6709")
    public static native String LocationISO6709Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTrackName")
    public static native String TrackNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierQuickTimeUserDataTaggedCharacteristic")
    public static native String TaggedCharacteristicValue();

}
