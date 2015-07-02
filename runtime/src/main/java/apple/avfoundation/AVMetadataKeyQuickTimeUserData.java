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
    public static native String AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyAuthor")
    public static native String AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyChapter")
    public static native String ChapterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyComment")
    public static native String CommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCreationDate")
    public static native String CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyDisclaimer")
    public static native String DisclaimerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyFullName")
    public static native String FullNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyGenre")
    public static native String GenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyHostComputer")
    public static native String HostComputerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyInformation")
    public static native String InformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyKeywords")
    public static native String KeywordsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyMake")
    public static native String MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyModel")
    public static native String ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalFormat")
    public static native String OriginalFormatValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyOriginalSource")
    public static native String OriginalSourceValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPerformers")
    public static native String PerformersValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyProduct")
    public static native String ProductValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeySoftware")
    public static native String SoftwareValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeySpecialPlaybackRequirements")
    public static native String SpecialPlaybackRequirementsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTrack")
    public static native String TrackValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyWarning")
    public static native String WarningValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyWriter")
    public static native String WriterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyURLLink")
    public static native String URLLinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyLocationISO6709")
    public static native String LocationISO6709Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTrackName")
    public static native String TrackNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("AVMetadataQuickTimeUserDataKeyTaggedCharacteristic")
    public static native String TaggedCharacteristicValue();

}
