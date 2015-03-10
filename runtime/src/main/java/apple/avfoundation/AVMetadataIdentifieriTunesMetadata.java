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
public class AVMetadataIdentifieriTunesMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataUserComment")
    public static native NSString UserCommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCoverArt")
    public static native NSString CoverArtValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataReleaseDate")
    public static native NSString ReleaseDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPredefinedGenre")
    public static native NSString PredefinedGenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataUserGenre")
    public static native NSString UserGenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSongName")
    public static native NSString SongNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataTrackSubTitle")
    public static native NSString TrackSubTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEncodingTool")
    public static native NSString EncodingToolValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAlbumArtist")
    public static native NSString AlbumArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAccountKind")
    public static native NSString AccountKindValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAppleID")
    public static native NSString AppleIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtistID")
    public static native NSString ArtistIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSongID")
    public static native NSString SongIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDiscCompilation")
    public static native NSString DiscCompilationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDiscNumber")
    public static native NSString DiscNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataGenreID")
    public static native NSString GenreIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataGrouping")
    public static native NSString GroupingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPlaylistID")
    public static native NSString PlaylistIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataContentRating")
    public static native NSString ContentRatingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataBeatsPerMin")
    public static native NSString BeatsPerMinValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataTrackNumber")
    public static native NSString TrackNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtDirector")
    public static native NSString ArtDirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataLyrics")
    public static native NSString LyricsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAcknowledgement")
    public static native NSString AcknowledgementValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataConductor")
    public static native NSString ConductorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEQ")
    public static native NSString EQValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataLinerNotes")
    public static native NSString LinerNotesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataRecordCompany")
    public static native NSString RecordCompanyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPerformer")
    public static native NSString PerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSoundEngineer")
    public static native NSString SoundEngineerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSoloist")
    public static native NSString SoloistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataThanks")
    public static native NSString ThanksValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataOnlineExtras")
    public static native NSString OnlineExtrasValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataExecProducer")
    public static native NSString ExecProducerValue();
    
}
