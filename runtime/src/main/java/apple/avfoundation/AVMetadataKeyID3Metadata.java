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
    public static native NSString AudioEncryptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAttachedPicture")
    public static native NSString AttachedPictureValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAudioSeekPointIndex")
    public static native NSString AudioSeekPointIndexValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyComments")
    public static native NSString CommentsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCommerical")
    public static native NSString CommericalValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncryption")
    public static native NSString EncryptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEqualization")
    public static native NSString EqualizationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEqualization2")
    public static native NSString Equalization2Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEventTimingCodes")
    public static native NSString EventTimingCodesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyGeneralEncapsulatedObject")
    public static native NSString GeneralEncapsulatedObjectValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyGroupIdentifier")
    public static native NSString GroupIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInvolvedPeopleList_v23")
    public static native NSString InvolvedPeopleList_v23Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLink")
    public static native NSString LinkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMusicCDIdentifier")
    public static native NSString MusicCDIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMPEGLocationLookupTable")
    public static native NSString MPEGLocationLookupTableValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOwnership")
    public static native NSString OwnershipValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPrivate")
    public static native NSString PrivateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPlayCounter")
    public static native NSString PlayCounterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPopularimeter")
    public static native NSString PopularimeterValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPositionSynchronization")
    public static native NSString PositionSynchronizationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecommendedBufferSize")
    public static native NSString RecommendedBufferSizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRelativeVolumeAdjustment")
    public static native NSString RelativeVolumeAdjustmentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRelativeVolumeAdjustment2")
    public static native NSString RelativeVolumeAdjustment2Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyReverb")
    public static native NSString ReverbValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySeek")
    public static native NSString SeekValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySignature")
    public static native NSString SignatureValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySynchronizedLyric")
    public static native NSString SynchronizedLyricValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySynchronizedTempoCodes")
    public static native NSString SynchronizedTempoCodesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAlbumTitle")
    public static native NSString AlbumTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyBeatsPerMinute")
    public static native NSString BeatsPerMinuteValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyContentType")
    public static native NSString ContentTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyDate")
    public static native NSString DateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodingTime")
    public static native NSString EncodingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPlaylistDelay")
    public static native NSString PlaylistDelayValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalReleaseTime")
    public static native NSString OriginalReleaseTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecordingTime")
    public static native NSString RecordingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyReleaseTime")
    public static native NSString ReleaseTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTaggingTime")
    public static native NSString TaggingTimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLyricist")
    public static native NSString LyricistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyFileType")
    public static native NSString FileTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTime")
    public static native NSString TimeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInvolvedPeopleList_v24")
    public static native NSString InvolvedPeopleList_v24Value();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyContentGroupDescription")
    public static native NSString ContentGroupDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTitleDescription")
    public static native NSString TitleDescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySubTitle")
    public static native NSString SubTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInitialKey")
    public static native NSString InitialKeyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLanguage")
    public static native NSString LanguageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLength")
    public static native NSString LengthValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMusicianCreditsList")
    public static native NSString MusicianCreditsListValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMediaType")
    public static native NSString MediaTypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyMood")
    public static native NSString MoodValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalAlbumTitle")
    public static native NSString OriginalAlbumTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalFilename")
    public static native NSString OriginalFilenameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalLyricist")
    public static native NSString OriginalLyricistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOriginalReleaseYear")
    public static native NSString OriginalReleaseYearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyFileOwner")
    public static native NSString FileOwnerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyLeadPerformer")
    public static native NSString LeadPerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyBand")
    public static native NSString BandValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyConductor")
    public static native NSString ConductorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyModifiedBy")
    public static native NSString ModifiedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPartOfASet")
    public static native NSString PartOfASetValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyProducedNotice")
    public static native NSString ProducedNoticeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTrackNumber")
    public static native NSString TrackNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyRecordingDates")
    public static native NSString RecordingDatesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternetRadioStationName")
    public static native NSString InternetRadioStationNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternetRadioStationOwner")
    public static native NSString InternetRadioStationOwnerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySize")
    public static native NSString SizeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyAlbumSortOrder")
    public static native NSString AlbumSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPerformerSortOrder")
    public static native NSString PerformerSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTitleSortOrder")
    public static native NSString TitleSortOrderValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyInternationalStandardRecordingCode")
    public static native NSString InternationalStandardRecordingCodeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyEncodedWith")
    public static native NSString EncodedWithValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeySetSubtitle")
    public static native NSString SetSubtitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyYear")
    public static native NSString YearValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUserText")
    public static native NSString UserTextValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUniqueFileIdentifier")
    public static native NSString UniqueFileIdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyTermsOfUse")
    public static native NSString TermsOfUseValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUnsynchronizedLyric")
    public static native NSString UnsynchronizedLyricValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCommercialInformation")
    public static native NSString CommercialInformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyCopyrightInformation")
    public static native NSString CopyrightInformationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialAudioFileWebpage")
    public static native NSString OfficialAudioFileWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialArtistWebpage")
    public static native NSString OfficialArtistWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialAudioSourceWebpage")
    public static native NSString OfficialAudioSourceWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialInternetRadioStationHomepage")
    public static native NSString OfficialInternetRadioStationHomepageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyPayment")
    public static native NSString PaymentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyOfficialPublisherWebpage")
    public static native NSString OfficialPublisherWebpageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataID3MetadataKeyUserURL")
    public static native NSString UserURLValue();

}
