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
    public static native String AlbumValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtist")
    public static native String ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyUserComment")
    public static native String UserCommentValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCoverArt")
    public static native String CoverArtValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCopyright")
    public static native String CopyrightValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyReleaseDate")
    public static native String ReleaseDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEncodedBy")
    public static native String EncodedByValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPredefinedGenre")
    public static native String PredefinedGenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyUserGenre")
    public static native String UserGenreValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySongName")
    public static native String SongNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyTrackSubTitle")
    public static native String TrackSubTitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEncodingTool")
    public static native String EncodingToolValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyComposer")
    public static native String ComposerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAlbumArtist")
    public static native String AlbumArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAccountKind")
    public static native String AccountKindValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAppleID")
    public static native String AppleIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtistID")
    public static native String ArtistIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySongID")
    public static native String SongIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDiscCompilation")
    public static native String DiscCompilationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDiscNumber")
    public static native String DiscNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyGenreID")
    public static native String GenreIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyGrouping")
    public static native String GroupingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPlaylistID")
    public static native String PlaylistIDValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyContentRating")
    public static native String ContentRatingValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyBeatsPerMin")
    public static native String BeatsPerMinValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyTrackNumber")
    public static native String TrackNumberValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArtDirector")
    public static native String ArtDirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyArranger")
    public static native String ArrangerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAuthor")
    public static native String AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyLyrics")
    public static native String LyricsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyAcknowledgement")
    public static native String AcknowledgementValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyConductor")
    public static native String ConductorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDescription")
    public static native String DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyDirector")
    public static native String DirectorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyEQ")
    public static native String EQValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyLinerNotes")
    public static native String LinerNotesValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyRecordCompany")
    public static native String RecordCompanyValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyOriginalArtist")
    public static native String OriginalArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPhonogramRights")
    public static native String PhonogramRightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyProducer")
    public static native String ProducerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPerformer")
    public static native String PerformerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyPublisher")
    public static native String PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySoundEngineer")
    public static native String SoundEngineerValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeySoloist")
    public static native String SoloistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyCredits")
    public static native String CreditsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyThanks")
    public static native String ThanksValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyOnlineExtras")
    public static native String OnlineExtrasValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataiTunesMetadataKeyExecProducer")
    public static native String ExecProducerValue();

}
