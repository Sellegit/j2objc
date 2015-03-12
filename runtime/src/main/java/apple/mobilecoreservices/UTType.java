package apple.mobilecoreservices;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("MobileCoreServices")
public class UTType 
    extends Object 
     {

    
    
    
    
    
    @Library("MobileCoreServices")
    public static class AbstractBase {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeItem")
        public static native String Item();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeContent")
        public static native String Content();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCompositeContent")
        public static native String CompositeContent();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMessage")
        public static native String Message();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeContact")
        public static native String Contact();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeArchive")
        public static native String Archive();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeDiskImage")
        public static native String DiskImage();
    }

    @Library("MobileCoreServices")
    public static class ConcreteBase {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeData")
        public static native String Data();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeDirectory")
        public static native String Directory();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeResolvable")
        public static native String Resolvable();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeSymLink")
        public static native String SymLink();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeExecutable")
        public static native String Executable();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMountPoint")
        public static native String MountPoint();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAliasFile")
        public static native String AliasFile();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAliasRecord")
        public static native String AliasRecord();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeURLBookmarkData")
        public static native String URLBookmarkData();
    }

    @Library("MobileCoreServices")
    public static class URL {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeURL")
        public static native String URL();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFileURL")
        public static native String FileURL();
    }

    @Library("MobileCoreServices")
    public static class Text {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeText")
        public static native String Text();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePlainText")
        public static native String PlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF8PlainText")
        public static native String UTF8PlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF16ExternalPlainText")
        public static native String UTF16ExternalPlainText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeUTF16PlainText")
        public static native String UTF16PlainText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeDelimitedText")
        public static native String DelimitedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeCommaSeparatedText")
        public static native String CommaSeparatedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeTabSeparatedText")
        public static native String TabSeparatedText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeUTF8TabSeparatedText")
        public static native String UTF8TabSeparatedText();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeRTF")
        public static native String RTF();
    }

    @Library("MobileCoreServices")
    public static class MarkupLanguage {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeHTML")
        public static native String HTML();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeXML")
        public static native String XML();
    }

    @Library("MobileCoreServices")
    public static class ProgrammingLanguage {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeSourceCode")
        public static native String SourceCode();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAssemblyLanguageSource")
        public static native String AssemblyLanguageSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCSource")
        public static native String CSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeObjectiveCSource")
        public static native String ObjectiveCSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCPlusPlusSource")
        public static native String CPlusPlusSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeObjectiveCPlusPlusSource")
        public static native String ObjectiveCPlusPlusSource();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCHeader")
        public static native String CHeader();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeCPlusPlusHeader")
        public static native String CPlusPlusHeader();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJavaSource")
        public static native String JavaSource();
    }

    @Library("MobileCoreServices")
    public static class ScriptingLanguage {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeScript")
        public static native String Script();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAppleScript")
        public static native String AppleScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeOSAScript")
        public static native String OSAScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeOSAScriptBundle")
        public static native String OSAScriptBundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaScript")
        public static native String JavaScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeShellScript")
        public static native String ShellScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePerlScript")
        public static native String PerlScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePythonScript")
        public static native String PythonScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeRubyScript")
        public static native String RubyScript();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePHPScript")
        public static native String PHPScript();
    }

    @Library("MobileCoreServices")
    public static class SerializedData {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJSON")
        public static native String JSON();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePropertyList")
        public static native String PropertyList();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeXMLPropertyList")
        public static native String XMLPropertyList();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBinaryPropertyList")
        public static native String BinaryPropertyList();
    }

    @Library("MobileCoreServices")
    public static class CompositeContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePDF")
        public static native String PDF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeRTFD")
        public static native String RTFD();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFlatRTFD")
        public static native String FlatRTFD();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeTXNTextAndMultimediaData")
        public static native String TXNTextAndMultimediaData();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeWebArchive")
        public static native String WebArchive();
    }

    @Library("MobileCoreServices")
    public static class ImageContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeImage")
        public static native String Image();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJPEG")
        public static native String JPEG();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeJPEG2000")
        public static native String JPEG2000();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeTIFF")
        public static native String TIFF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePICT")
        public static native String PICT();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeGIF")
        public static native String GIF();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePNG")
        public static native String PNG();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeQuickTimeImage")
        public static native String QuickTimeImage();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAppleICNS")
        public static native String AppleICNS();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeBMP")
        public static native String BMP();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeICO")
        public static native String ICO();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeRawImage")
        public static native String RawImage();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeScalableVectorGraphics")
        public static native String ScalableVectorGraphics();
    }

    @Library("MobileCoreServices")
    public static class AudiovisualContent {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAudiovisualContent")
        public static native String AudiovisualContent();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMovie")
        public static native String Movie();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVideo")
        public static native String Video();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAudio")
        public static native String Audio();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeQuickTimeMovie")
        public static native String QuickTimeMovie();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG")
        public static native String MPEG();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG2Video")
        public static native String MPEG2Video();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG2TransportStream")
        public static native String MPEG2TransportStream();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMP3")
        public static native String MP3();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG4")
        public static native String MPEG4();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeMPEG4Audio")
        public static native String MPEG4Audio();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeAppleProtectedMPEG4Audio")
        public static native String AppleProtectedMPEG4Audio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAppleProtectedMPEG4Video")
        public static native String AppleProtectedMPEG4Video();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAVIMovie")
        public static native String AVIMovie();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeAudioInterchangeFileFormat")
        public static native String AudioInterchangeFileFormat();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeWaveformAudio")
        public static native String WaveformAudio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeMIDIAudio")
        public static native String MIDIAudio();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePlaylist")
        public static native String Playlist();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeM3UPlaylist")
        public static native String M3UPlaylist();
    }

    @Library("MobileCoreServices")
    public static class Directory {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFolder")
        public static native String Folder();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVolume")
        public static native String Volume();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypePackage")
        public static native String Package();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeBundle")
        public static native String Bundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePluginBundle")
        public static native String PluginBundle();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSpotlightImporter")
        public static native String SpotlightImporter();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeQuickLookGenerator")
        public static native String QuickLookGenerator();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeXPCService")
        public static native String XPCService();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeFramework")
        public static native String Framework();
    }

    @Library("MobileCoreServices")
    public static class ApplicationAndExecutable {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplication")
        public static native String Application();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplicationBundle")
        public static native String ApplicationBundle();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeApplicationFile")
        public static native String ApplicationFile();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeUnixExecutable")
        public static native String UnixExecutable();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeWindowsExecutable")
        public static native String WindowsExecutable();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaClass")
        public static native String JavaClass();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeJavaArchive")
        public static native String JavaArchive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSystemPreferencesPane")
        public static native String SystemPreferencesPane();
    }

    @Library("MobileCoreServices")
    public static class Archive {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeGNUZipArchive")
        public static native String GNUZipArchive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBzip2Archive")
        public static native String Bzip2Archive();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeZipArchive")
        public static native String ZipArchive();
    }

    @Library("MobileCoreServices")
    public static class Document {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeSpreadsheet")
        public static native String Spreadsheet();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePresentation")
        public static native String Presentation();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeDatabase")
        public static native String Database();
    }

    @Library("MobileCoreServices")
    public static class Contact {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeVCard")
        public static native String VCard();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeToDoItem")
        public static native String ToDoItem();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeCalendarEvent")
        public static native String CalendarEvent();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeEmailMessage")
        public static native String EmailMessage();
    }

    @Library("MobileCoreServices")
    public static class Internet {

        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeInternetLocation")
        public static native String InternetLocation();
    }

    @Library("MobileCoreServices")
    public static class Miscellaneous {

        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalConstant("kUTTypeInkText")
        public static native String InkText();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeFont")
        public static native String Font();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeBookmark")
        public static native String Bookmark();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTType3DContent")
        public static native String _3DContent();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypePKCS12")
        public static native String PKCS12();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeX509Certificate")
        public static native String X509Certificate();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeElectronicPublication")
        public static native String ElectronicPublication();
        /**
         * @since Available in iOS 8.0 and later.
         */
        @GlobalConstant("kUTTypeLog")
        public static native String Log();
    }
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCreatePreferredIdentifierForTag")
    public static native String createPreferredIdentifierForTag(String inTagClass, String inTag, String inConformingToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCreateAllIdentifiersForTag")
    public static native List<String> createAllIdentifiersForTag(String inTagClass, String inTag, String inConformingToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyPreferredTagWithClass")
    public static native String getPreferredTagWithClass(String inUTI, String inTagClass);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeCopyAllTagsWithClass")
    public static native List<String> getAllTagsWithClass(String inUTI, String inTagClass);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeEqual")
    public static native boolean typeEqualsTo(String inUTI1, String inUTI2);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeConformsTo")
    public static native boolean typeConformsTo(String inUTI, String inConformsToUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDescription")
    public static native String getDescriptionForType(String inUTI);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeIsDeclared")
    public static native boolean typeIsDeclared(String inUTI);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalFunction("UTTypeIsDynamic")
    public static native boolean typeIsDynamic(String inUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDeclaration")
    public static native UTTypeDeclaration getDeclarationForType(String inUTI);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("UTTypeCopyDeclaringBundleURL")
    public static native NSURL getDeclaringBundleURLForType(String inUTI);
    
}
