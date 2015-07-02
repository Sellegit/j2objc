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
public class AVMetadataIdentifierID3Metadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAudioEncryption")
    public static native String AudioEncryptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAttachedPicture")
    public static native String AttachedPictureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAudioSeekPointIndex")
    public static native String AudioSeekPointIndexValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataComments")
    public static native String CommentsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCommerical")
    public static native String CommericalValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncryption")
    public static native String EncryptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEqualization")
    public static native String EqualizationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEqualization2")
    public static native String Equalization2Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEventTimingCodes")
    public static native String EventTimingCodesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataGeneralEncapsulatedObject")
    public static native String GeneralEncapsulatedObjectValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataGroupIdentifier")
    public static native String GroupIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInvolvedPeopleList_v23")
    public static native String InvolvedPeopleList_v23Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLink")
    public static native String LinkValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMusicCDIdentifier")
    public static native String MusicCDIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMPEGLocationLookupTable")
    public static native String MPEGLocationLookupTableValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOwnership")
    public static native String OwnershipValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPrivate")
    public static native String PrivateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPlayCounter")
    public static native String PlayCounterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPopularimeter")
    public static native String PopularimeterValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPositionSynchronization")
    public static native String PositionSynchronizationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecommendedBufferSize")
    public static native String RecommendedBufferSizeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment")
    public static native String RelativeVolumeAdjustmentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRelativeVolumeAdjustment2")
    public static native String RelativeVolumeAdjustment2Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataReverb")
    public static native String ReverbValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSeek")
    public static native String SeekValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSignature")
    public static native String SignatureValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSynchronizedLyric")
    public static native String SynchronizedLyricValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSynchronizedTempoCodes")
    public static native String SynchronizedTempoCodesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAlbumTitle")
    public static native String AlbumTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataBeatsPerMinute")
    public static native String BeatsPerMinuteValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataContentType")
    public static native String ContentTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataDate")
    public static native String DateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodingTime")
    public static native String EncodingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPlaylistDelay")
    public static native String PlaylistDelayValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalReleaseTime")
    public static native String OriginalReleaseTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecordingTime")
    public static native String RecordingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataReleaseTime")
    public static native String ReleaseTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTaggingTime")
    public static native String TaggingTimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLyricist")
    public static native String LyricistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataFileType")
    public static native String FileTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTime")
    public static native String TimeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInvolvedPeopleList_v24")
    public static native String InvolvedPeopleList_v24Value();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataContentGroupDescription")
    public static native String ContentGroupDescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTitleDescription")
    public static native String TitleDescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSubTitle")
    public static native String SubTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInitialKey")
    public static native String InitialKeyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLanguage")
    public static native String LanguageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLength")
    public static native String LengthValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMusicianCreditsList")
    public static native String MusicianCreditsListValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMediaType")
    public static native String MediaTypeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataMood")
    public static native String MoodValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalAlbumTitle")
    public static native String OriginalAlbumTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalFilename")
    public static native String OriginalFilenameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalLyricist")
    public static native String OriginalLyricistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOriginalReleaseYear")
    public static native String OriginalReleaseYearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataFileOwner")
    public static native String FileOwnerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataLeadPerformer")
    public static native String LeadPerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataBand")
    public static native String BandValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataConductor")
    public static native String ConductorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataModifiedBy")
    public static native String ModifiedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPartOfASet")
    public static native String PartOfASetValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataProducedNotice")
    public static native String ProducedNoticeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTrackNumber")
    public static native String TrackNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataRecordingDates")
    public static native String RecordingDatesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternetRadioStationName")
    public static native String InternetRadioStationNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternetRadioStationOwner")
    public static native String InternetRadioStationOwnerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSize")
    public static native String SizeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataAlbumSortOrder")
    public static native String AlbumSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPerformerSortOrder")
    public static native String PerformerSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTitleSortOrder")
    public static native String TitleSortOrderValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataInternationalStandardRecordingCode")
    public static native String InternationalStandardRecordingCodeValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataEncodedWith")
    public static native String EncodedWithValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataSetSubtitle")
    public static native String SetSubtitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataYear")
    public static native String YearValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUserText")
    public static native String UserTextValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUniqueFileIdentifier")
    public static native String UniqueFileIdentifierValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataTermsOfUse")
    public static native String TermsOfUseValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUnsynchronizedLyric")
    public static native String UnsynchronizedLyricValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCommercialInformation")
    public static native String CommercialInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataCopyrightInformation")
    public static native String CopyrightInformationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialAudioFileWebpage")
    public static native String OfficialAudioFileWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialArtistWebpage")
    public static native String OfficialArtistWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialAudioSourceWebpage")
    public static native String OfficialAudioSourceWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialInternetRadioStationHomepage")
    public static native String OfficialInternetRadioStationHomepageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataPayment")
    public static native String PaymentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataOfficialPublisherWebpage")
    public static native String OfficialPublisherWebpageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifierID3MetadataUserURL")
    public static native String UserURLValue();

}
