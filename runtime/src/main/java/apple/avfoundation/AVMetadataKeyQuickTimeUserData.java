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
public class AVMetadataKeyQuickTimeUserData 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyChapter")
    public static native NSString ChapterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyComment")
    public static native NSString CommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCreationDate")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDisclaimer")
    public static native NSString DisclaimerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyFullName")
    public static native NSString FullNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyGenre")
    public static native NSString GenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyHostComputer")
    public static native NSString HostComputerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyInformation")
    public static native NSString InformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyKeywords")
    public static native NSString KeywordsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyMake")
    public static native NSString MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalFormat")
    public static native NSString OriginalFormatValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalSource")
    public static native NSString OriginalSourceValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPerformers")
    public static native NSString PerformersValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyProduct")
    public static native NSString ProductValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeySoftware")
    public static native NSString SoftwareValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeySpecialPlaybackRequirements")
    public static native NSString SpecialPlaybackRequirementsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTrack")
    public static native NSString TrackValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyWarning")
    public static native NSString WarningValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyWriter")
    public static native NSString WriterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyURLLink")
    public static native NSString URLLinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyLocationISO6709")
    public static native NSString LocationISO6709Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTrackName")
    public static native NSString TrackNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTaggedCharacteristic")
    public static native NSString TaggedCharacteristicValue();
    
}
