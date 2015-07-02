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
public class AVMetadataKeyID3Metadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAudioEncryption")
    public static native String AudioEncryptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAttachedPicture")
    public static native String AttachedPictureValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAudioSeekPointIndex")
    public static native String AudioSeekPointIndexValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyComments")
    public static native String CommentsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCommerical")
    public static native String CommericalValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncryption")
    public static native String EncryptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEqualization")
    public static native String EqualizationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEqualization2")
    public static native String Equalization2Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEventTimingCodes")
    public static native String EventTimingCodesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyGeneralEncapsulatedObject")
    public static native String GeneralEncapsulatedObjectValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyGroupIdentifier")
    public static native String GroupIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInvolvedPeopleList_v23")
    public static native String InvolvedPeopleList_v23Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLink")
    public static native String LinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMusicCDIdentifier")
    public static native String MusicCDIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMPEGLocationLookupTable")
    public static native String MPEGLocationLookupTableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOwnership")
    public static native String OwnershipValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPrivate")
    public static native String PrivateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPlayCounter")
    public static native String PlayCounterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPopularimeter")
    public static native String PopularimeterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPositionSynchronization")
    public static native String PositionSynchronizationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecommendedBufferSize")
    public static native String RecommendedBufferSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRelativeVolumeAdjustment")
    public static native String RelativeVolumeAdjustmentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRelativeVolumeAdjustment2")
    public static native String RelativeVolumeAdjustment2Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyReverb")
    public static native String ReverbValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySeek")
    public static native String SeekValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySignature")
    public static native String SignatureValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySynchronizedLyric")
    public static native String SynchronizedLyricValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySynchronizedTempoCodes")
    public static native String SynchronizedTempoCodesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAlbumTitle")
    public static native String AlbumTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyBeatsPerMinute")
    public static native String BeatsPerMinuteValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyContentType")
    public static native String ContentTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyDate")
    public static native String DateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodingTime")
    public static native String EncodingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPlaylistDelay")
    public static native String PlaylistDelayValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalReleaseTime")
    public static native String OriginalReleaseTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecordingTime")
    public static native String RecordingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyReleaseTime")
    public static native String ReleaseTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTaggingTime")
    public static native String TaggingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLyricist")
    public static native String LyricistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyFileType")
    public static native String FileTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTime")
    public static native String TimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInvolvedPeopleList_v24")
    public static native String InvolvedPeopleList_v24Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyContentGroupDescription")
    public static native String ContentGroupDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTitleDescription")
    public static native String TitleDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySubTitle")
    public static native String SubTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInitialKey")
    public static native String InitialKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLanguage")
    public static native String LanguageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLength")
    public static native String LengthValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMusicianCreditsList")
    public static native String MusicianCreditsListValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMediaType")
    public static native String MediaTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMood")
    public static native String MoodValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalAlbumTitle")
    public static native String OriginalAlbumTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalFilename")
    public static native String OriginalFilenameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalLyricist")
    public static native String OriginalLyricistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalReleaseYear")
    public static native String OriginalReleaseYearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyFileOwner")
    public static native String FileOwnerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLeadPerformer")
    public static native String LeadPerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyBand")
    public static native String BandValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyConductor")
    public static native String ConductorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyModifiedBy")
    public static native String ModifiedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPartOfASet")
    public static native String PartOfASetValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyProducedNotice")
    public static native String ProducedNoticeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTrackNumber")
    public static native String TrackNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecordingDates")
    public static native String RecordingDatesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternetRadioStationName")
    public static native String InternetRadioStationNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternetRadioStationOwner")
    public static native String InternetRadioStationOwnerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySize")
    public static native String SizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAlbumSortOrder")
    public static native String AlbumSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPerformerSortOrder")
    public static native String PerformerSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTitleSortOrder")
    public static native String TitleSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternationalStandardRecordingCode")
    public static native String InternationalStandardRecordingCodeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodedWith")
    public static native String EncodedWithValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySetSubtitle")
    public static native String SetSubtitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyYear")
    public static native String YearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUserText")
    public static native String UserTextValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUniqueFileIdentifier")
    public static native String UniqueFileIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTermsOfUse")
    public static native String TermsOfUseValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUnsynchronizedLyric")
    public static native String UnsynchronizedLyricValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCommercialInformation")
    public static native String CommercialInformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCopyrightInformation")
    public static native String CopyrightInformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialAudioFileWebpage")
    public static native String OfficialAudioFileWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialArtistWebpage")
    public static native String OfficialArtistWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialAudioSourceWebpage")
    public static native String OfficialAudioSourceWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage")
    public static native String OfficialInternetRadioStationHomepageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPayment")
    public static native String PaymentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialPublisherWebpage")
    public static native String OfficialPublisherWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUserURL")
    public static native String UserURLValue();

}
