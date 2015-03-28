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
public class AVMetadataKeyiTunesMetadata 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAlbum")
    public static native NSString AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyUserComment")
    public static native NSString UserCommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCoverArt")
    public static native NSString CoverArtValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCopyright")
    public static native NSString CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyReleaseDate")
    public static native NSString ReleaseDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEncodedBy")
    public static native NSString EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPredefinedGenre")
    public static native NSString PredefinedGenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyUserGenre")
    public static native NSString UserGenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySongName")
    public static native NSString SongNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyTrackSubTitle")
    public static native NSString TrackSubTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEncodingTool")
    public static native NSString EncodingToolValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyComposer")
    public static native NSString ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAlbumArtist")
    public static native NSString AlbumArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAccountKind")
    public static native NSString AccountKindValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAppleID")
    public static native NSString AppleIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtistID")
    public static native NSString ArtistIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySongID")
    public static native NSString SongIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDiscCompilation")
    public static native NSString DiscCompilationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDiscNumber")
    public static native NSString DiscNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyGenreID")
    public static native NSString GenreIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyGrouping")
    public static native NSString GroupingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPlaylistID")
    public static native NSString PlaylistIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyContentRating")
    public static native NSString ContentRatingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyBeatsPerMin")
    public static native NSString BeatsPerMinValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyTrackNumber")
    public static native NSString TrackNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtDirector")
    public static native NSString ArtDirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArranger")
    public static native NSString ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyLyrics")
    public static native NSString LyricsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAcknowledgement")
    public static native NSString AcknowledgementValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyConductor")
    public static native NSString ConductorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDirector")
    public static native NSString DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEQ")
    public static native NSString EQValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyLinerNotes")
    public static native NSString LinerNotesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyRecordCompany")
    public static native NSString RecordCompanyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyOriginalArtist")
    public static native NSString OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPhonogramRights")
    public static native NSString PhonogramRightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyProducer")
    public static native NSString ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPerformer")
    public static native NSString PerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySoundEngineer")
    public static native NSString SoundEngineerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySoloist")
    public static native NSString SoloistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCredits")
    public static native NSString CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyThanks")
    public static native NSString ThanksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyOnlineExtras")
    public static native NSString OnlineExtrasValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyExecProducer")
    public static native NSString ExecProducerValue();

}
