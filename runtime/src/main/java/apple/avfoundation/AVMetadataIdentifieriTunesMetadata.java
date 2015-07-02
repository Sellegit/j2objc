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
public class AVMetadataIdentifieriTunesMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAlbum")
    public static native String AlbumValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataUserComment")
    public static native String UserCommentValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCoverArt")
    public static native String CoverArtValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataReleaseDate")
    public static native String ReleaseDateValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPredefinedGenre")
    public static native String PredefinedGenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataUserGenre")
    public static native String UserGenreValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSongName")
    public static native String SongNameValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataTrackSubTitle")
    public static native String TrackSubTitleValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEncodingTool")
    public static native String EncodingToolValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAlbumArtist")
    public static native String AlbumArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAccountKind")
    public static native String AccountKindValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAppleID")
    public static native String AppleIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtistID")
    public static native String ArtistIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSongID")
    public static native String SongIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDiscCompilation")
    public static native String DiscCompilationValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDiscNumber")
    public static native String DiscNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataGenreID")
    public static native String GenreIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataGrouping")
    public static native String GroupingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPlaylistID")
    public static native String PlaylistIDValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataContentRating")
    public static native String ContentRatingValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataBeatsPerMin")
    public static native String BeatsPerMinValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataTrackNumber")
    public static native String TrackNumberValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArtDirector")
    public static native String ArtDirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAuthor")
    public static native String AuthorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataLyrics")
    public static native String LyricsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataAcknowledgement")
    public static native String AcknowledgementValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataConductor")
    public static native String ConductorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataEQ")
    public static native String EQValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataLinerNotes")
    public static native String LinerNotesValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataRecordCompany")
    public static native String RecordCompanyValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPerformer")
    public static native String PerformerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSoundEngineer")
    public static native String SoundEngineerValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataSoloist")
    public static native String SoloistValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataThanks")
    public static native String ThanksValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataOnlineExtras")
    public static native String OnlineExtrasValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("AVMetadataIdentifieriTunesMetadataExecProducer")
    public static native String ExecProducerValue();

}
