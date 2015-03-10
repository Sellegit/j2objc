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
public class AVMetadataIdentifierID3Metadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAudioEncryption")
    public static native NSString AudioEncryptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAttachedPicture")
    public static native NSString AttachedPictureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAudioSeekPointIndex")
    public static native NSString AudioSeekPointIndexValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataComments")
    public static native NSString CommentsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCommerical")
    public static native NSString CommericalValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncryption")
    public static native NSString EncryptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEqualization")
    public static native NSString EqualizationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEqualization2")
    public static native NSString Equalization2Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEventTimingCodes")
    public static native NSString EventTimingCodesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject")
    public static native NSString GeneralEncapsulatedObjectValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataGroupIdentifier")
    public static native NSString GroupIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23")
    public static native NSString InvolvedPeopleList_v23Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLink")
    public static native NSString LinkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMusicCDIdentifier")
    public static native NSString MusicCDIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMPEGLocationLookupTable")
    public static native NSString MPEGLocationLookupTableValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOwnership")
    public static native NSString OwnershipValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPrivate")
    public static native NSString PrivateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPlayCounter")
    public static native NSString PlayCounterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPopularimeter")
    public static native NSString PopularimeterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPositionSynchronization")
    public static native NSString PositionSynchronizationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecommendedBufferSize")
    public static native NSString RecommendedBufferSizeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment")
    public static native NSString RelativeVolumeAdjustmentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2")
    public static native NSString RelativeVolumeAdjustment2Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataReverb")
    public static native NSString ReverbValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSeek")
    public static native NSString SeekValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSignature")
    public static native NSString SignatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSynchronizedLyric")
    public static native NSString SynchronizedLyricValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSynchronizedTempoCodes")
    public static native NSString SynchronizedTempoCodesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAlbumTitle")
    public static native NSString AlbumTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataBeatsPerMinute")
    public static native NSString BeatsPerMinuteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataContentType")
    public static native NSString ContentTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataDate")
    public static native NSString DateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodingTime")
    public static native NSString EncodingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPlaylistDelay")
    public static native NSString PlaylistDelayValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalReleaseTime")
    public static native NSString OriginalReleaseTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecordingTime")
    public static native NSString RecordingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataReleaseTime")
    public static native NSString ReleaseTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTaggingTime")
    public static native NSString TaggingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLyricist")
    public static native NSString LyricistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataFileType")
    public static native NSString FileTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTime")
    public static native NSString TimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24")
    public static native NSString InvolvedPeopleList_v24Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataContentGroupDescription")
    public static native NSString ContentGroupDescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTitleDescription")
    public static native NSString TitleDescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSubTitle")
    public static native NSString SubTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInitialKey")
    public static native NSString InitialKeyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLanguage")
    public static native NSString LanguageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLength")
    public static native NSString LengthValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMusicianCreditsList")
    public static native NSString MusicianCreditsListValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMediaType")
    public static native NSString MediaTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMood")
    public static native NSString MoodValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalAlbumTitle")
    public static native NSString OriginalAlbumTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalFilename")
    public static native NSString OriginalFilenameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalLyricist")
    public static native NSString OriginalLyricistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalReleaseYear")
    public static native NSString OriginalReleaseYearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataFileOwner")
    public static native NSString FileOwnerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLeadPerformer")
    public static native NSString LeadPerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataBand")
    public static native NSString BandValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataConductor")
    public static native NSString ConductorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataModifiedBy")
    public static native NSString ModifiedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPartOfASet")
    public static native NSString PartOfASetValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataProducedNotice")
    public static native NSString ProducedNoticeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTrackNumber")
    public static native NSString TrackNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecordingDates")
    public static native NSString RecordingDatesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternetRadioStationName")
    public static native NSString InternetRadioStationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternetRadioStationOwner")
    public static native NSString InternetRadioStationOwnerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSize")
    public static native NSString SizeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAlbumSortOrder")
    public static native NSString AlbumSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPerformerSortOrder")
    public static native NSString PerformerSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTitleSortOrder")
    public static native NSString TitleSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode")
    public static native NSString InternationalStandardRecordingCodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodedWith")
    public static native NSString EncodedWithValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSetSubtitle")
    public static native NSString SetSubtitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataYear")
    public static native NSString YearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUserText")
    public static native NSString UserTextValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUniqueFileIdentifier")
    public static native NSString UniqueFileIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTermsOfUse")
    public static native NSString TermsOfUseValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUnsynchronizedLyric")
    public static native NSString UnsynchronizedLyricValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCommercialInformation")
    public static native NSString CommercialInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCopyrightInformation")
    public static native NSString CopyrightInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage")
    public static native NSString OfficialAudioFileWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialArtistWebpage")
    public static native NSString OfficialArtistWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage")
    public static native NSString OfficialAudioSourceWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage")
    public static native NSString OfficialInternetRadioStationHomepageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPayment")
    public static native NSString PaymentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialPublisherWebpage")
    public static native NSString OfficialPublisherWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUserURL")
    public static native NSString UserURLValue();
    
}
