package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation/Foundation.h")
@Mapping("NSXMLParserErrorCode")
public final class NSXMLParserErrorCode extends ObjCEnum {
    
    @GlobalConstant("NSXMLParserInternalError")
    public static final long Internal = 1L;
    @GlobalConstant("NSXMLParserOutOfMemoryError")
    public static final long OutOfMemory = 2L;
    @GlobalConstant("NSXMLParserDocumentStartError")
    public static final long DocumentStart = 3L;
    @GlobalConstant("NSXMLParserEmptyDocumentError")
    public static final long EmptyDocument = 4L;
    @GlobalConstant("NSXMLParserPrematureDocumentEndError")
    public static final long PrematureDocumentEnd = 5L;
    @GlobalConstant("NSXMLParserInvalidHexCharacterRefError")
    public static final long InvalidHexCharacterRef = 6L;
    @GlobalConstant("NSXMLParserInvalidDecimalCharacterRefError")
    public static final long InvalidDecimalCharacterRef = 7L;
    @GlobalConstant("NSXMLParserInvalidCharacterRefError")
    public static final long InvalidCharacterRef = 8L;
    @GlobalConstant("NSXMLParserInvalidCharacterError")
    public static final long InvalidCharacter = 9L;
    @GlobalConstant("NSXMLParserCharacterRefAtEOFError")
    public static final long CharacterRefAtEOF = 10L;
    @GlobalConstant("NSXMLParserCharacterRefInPrologError")
    public static final long CharacterRefInProlog = 11L;
    @GlobalConstant("NSXMLParserCharacterRefInEpilogError")
    public static final long CharacterRefInEpilog = 12L;
    @GlobalConstant("NSXMLParserCharacterRefInDTDError")
    public static final long CharacterRefInDTD = 13L;
    @GlobalConstant("NSXMLParserEntityRefAtEOFError")
    public static final long EntityRefAtEOF = 14L;
    @GlobalConstant("NSXMLParserEntityRefInPrologError")
    public static final long EntityRefInProlog = 15L;
    @GlobalConstant("NSXMLParserEntityRefInEpilogError")
    public static final long EntityRefInEpilog = 16L;
    @GlobalConstant("NSXMLParserEntityRefInDTDError")
    public static final long EntityRefInDTD = 17L;
    @GlobalConstant("NSXMLParserParsedEntityRefAtEOFError")
    public static final long ParsedEntityRefAtEOF = 18L;
    @GlobalConstant("NSXMLParserParsedEntityRefInPrologError")
    public static final long ParsedEntityRefInProlog = 19L;
    @GlobalConstant("NSXMLParserParsedEntityRefInEpilogError")
    public static final long ParsedEntityRefInEpilog = 20L;
    @GlobalConstant("NSXMLParserParsedEntityRefInInternalSubsetError")
    public static final long ParsedEntityRefInInternalSubset = 21L;
    @GlobalConstant("NSXMLParserEntityReferenceWithoutNameError")
    public static final long EntityReferenceWithoutName = 22L;
    @GlobalConstant("NSXMLParserEntityReferenceMissingSemiError")
    public static final long EntityReferenceMissingSemi = 23L;
    @GlobalConstant("NSXMLParserParsedEntityRefNoNameError")
    public static final long ParsedEntityRefNoName = 24L;
    @GlobalConstant("NSXMLParserParsedEntityRefMissingSemiError")
    public static final long ParsedEntityRefMissingSemi = 25L;
    @GlobalConstant("NSXMLParserUndeclaredEntityError")
    public static final long UndeclaredEntity = 26L;
    @GlobalConstant("NSXMLParserUnparsedEntityError")
    public static final long UnparsedEntity = 28L;
    @GlobalConstant("NSXMLParserEntityIsExternalError")
    public static final long EntityIsExternal = 29L;
    @GlobalConstant("NSXMLParserEntityIsParameterError")
    public static final long EntityIsParameter = 30L;
    @GlobalConstant("NSXMLParserUnknownEncodingError")
    public static final long UnknownEncoding = 31L;
    @GlobalConstant("NSXMLParserEncodingNotSupportedError")
    public static final long EncodingNotSupported = 32L;
    @GlobalConstant("NSXMLParserStringNotStartedError")
    public static final long StringNotStarted = 33L;
    @GlobalConstant("NSXMLParserStringNotClosedError")
    public static final long StringNotClosed = 34L;
    @GlobalConstant("NSXMLParserNamespaceDeclarationError")
    public static final long NamespaceDeclaration = 35L;
    @GlobalConstant("NSXMLParserEntityNotStartedError")
    public static final long EntityNotStarted = 36L;
    @GlobalConstant("NSXMLParserEntityNotFinishedError")
    public static final long EntityNotFinished = 37L;
    @GlobalConstant("NSXMLParserLessThanSymbolInAttributeError")
    public static final long LessThanSymbolInAttribute = 38L;
    @GlobalConstant("NSXMLParserAttributeNotStartedError")
    public static final long AttributeNotStarted = 39L;
    @GlobalConstant("NSXMLParserAttributeNotFinishedError")
    public static final long AttributeNotFinished = 40L;
    @GlobalConstant("NSXMLParserAttributeHasNoValueError")
    public static final long AttributeHasNoValue = 41L;
    @GlobalConstant("NSXMLParserAttributeRedefinedError")
    public static final long AttributeRedefined = 42L;
    @GlobalConstant("NSXMLParserLiteralNotStartedError")
    public static final long LiteralNotStarted = 43L;
    @GlobalConstant("NSXMLParserLiteralNotFinishedError")
    public static final long LiteralNotFinished = 44L;
    @GlobalConstant("NSXMLParserCommentNotFinishedError")
    public static final long CommentNotFinished = 45L;
    @GlobalConstant("NSXMLParserProcessingInstructionNotStartedError")
    public static final long ProcessingInstructionNotStarted = 46L;
    @GlobalConstant("NSXMLParserProcessingInstructionNotFinishedError")
    public static final long ProcessingInstructionNotFinished = 47L;
    @GlobalConstant("NSXMLParserNotationNotStartedError")
    public static final long NotationNotStarted = 48L;
    @GlobalConstant("NSXMLParserNotationNotFinishedError")
    public static final long NotationNotFinished = 49L;
    @GlobalConstant("NSXMLParserAttributeListNotStartedError")
    public static final long AttributeListNotStarted = 50L;
    @GlobalConstant("NSXMLParserAttributeListNotFinishedError")
    public static final long AttributeListNotFinished = 51L;
    @GlobalConstant("NSXMLParserMixedContentDeclNotStartedError")
    public static final long MixedContentDeclNotStarted = 52L;
    @GlobalConstant("NSXMLParserMixedContentDeclNotFinishedError")
    public static final long MixedContentDeclNotFinished = 53L;
    @GlobalConstant("NSXMLParserElementContentDeclNotStartedError")
    public static final long ElementContentDeclNotStarted = 54L;
    @GlobalConstant("NSXMLParserElementContentDeclNotFinishedError")
    public static final long ElementContentDeclNotFinished = 55L;
    @GlobalConstant("NSXMLParserXMLDeclNotStartedError")
    public static final long XMLDeclNotStarted = 56L;
    @GlobalConstant("NSXMLParserXMLDeclNotFinishedError")
    public static final long XMLDeclNotFinished = 57L;
    @GlobalConstant("NSXMLParserConditionalSectionNotStartedError")
    public static final long ConditionalSectionNotStarted = 58L;
    @GlobalConstant("NSXMLParserConditionalSectionNotFinishedError")
    public static final long ConditionalSectionNotFinished = 59L;
    @GlobalConstant("NSXMLParserExternalSubsetNotFinishedError")
    public static final long ExternalSubsetNotFinished = 60L;
    @GlobalConstant("NSXMLParserDOCTYPEDeclNotFinishedError")
    public static final long DOCTYPEDeclNotFinished = 61L;
    @GlobalConstant("NSXMLParserMisplacedCDATAEndStringError")
    public static final long MisplacedCDATAEndString = 62L;
    @GlobalConstant("NSXMLParserCDATANotFinishedError")
    public static final long CDATANotFinished = 63L;
    @GlobalConstant("NSXMLParserMisplacedXMLDeclarationError")
    public static final long MisplacedXMLDeclaration = 64L;
    @GlobalConstant("NSXMLParserSpaceRequiredError")
    public static final long SpaceRequired = 65L;
    @GlobalConstant("NSXMLParserSeparatorRequiredError")
    public static final long SeparatorRequired = 66L;
    @GlobalConstant("NSXMLParserNMTOKENRequiredError")
    public static final long NMTOKENRequired = 67L;
    @GlobalConstant("NSXMLParserNAMERequiredError")
    public static final long NAMERequired = 68L;
    @GlobalConstant("NSXMLParserPCDATARequiredError")
    public static final long PCDATARequired = 69L;
    @GlobalConstant("NSXMLParserURIRequiredError")
    public static final long URIRequired = 70L;
    @GlobalConstant("NSXMLParserPublicIdentifierRequiredError")
    public static final long PublicIdentifierRequired = 71L;
    @GlobalConstant("NSXMLParserLTRequiredError")
    public static final long LTRequired = 72L;
    @GlobalConstant("NSXMLParserGTRequiredError")
    public static final long GTRequired = 73L;
    @GlobalConstant("NSXMLParserLTSlashRequiredError")
    public static final long LTSlashRequired = 74L;
    @GlobalConstant("NSXMLParserEqualExpectedError")
    public static final long EqualExpected = 75L;
    @GlobalConstant("NSXMLParserTagNameMismatchError")
    public static final long TagNameMismatch = 76L;
    @GlobalConstant("NSXMLParserUnfinishedTagError")
    public static final long UnfinishedTag = 77L;
    @GlobalConstant("NSXMLParserStandaloneValueError")
    public static final long StandaloneValue = 78L;
    @GlobalConstant("NSXMLParserInvalidEncodingNameError")
    public static final long InvalidEncodingName = 79L;
    @GlobalConstant("NSXMLParserCommentContainsDoubleHyphenError")
    public static final long CommentContainsDoubleHyphen = 80L;
    @GlobalConstant("NSXMLParserInvalidEncodingError")
    public static final long InvalidEncoding = 81L;
    @GlobalConstant("NSXMLParserExternalStandaloneEntityError")
    public static final long ExternalStandaloneEntity = 82L;
    @GlobalConstant("NSXMLParserInvalidConditionalSectionError")
    public static final long InvalidConditionalSection = 83L;
    @GlobalConstant("NSXMLParserEntityValueRequiredError")
    public static final long EntityValueRequired = 84L;
    @GlobalConstant("NSXMLParserNotWellBalancedError")
    public static final long NotWellBalanced = 85L;
    @GlobalConstant("NSXMLParserExtraContentError")
    public static final long ExtraContent = 86L;
    @GlobalConstant("NSXMLParserInvalidCharacterInEntityError")
    public static final long InvalidCharacterInEntity = 87L;
    @GlobalConstant("NSXMLParserParsedEntityRefInInternalError")
    public static final long ParsedEntityRefInInternal = 88L;
    @GlobalConstant("NSXMLParserEntityRefLoopError")
    public static final long EntityRefLoop = 89L;
    @GlobalConstant("NSXMLParserEntityBoundaryError")
    public static final long EntityBoundary = 90L;
    @GlobalConstant("NSXMLParserInvalidURIError")
    public static final long InvalidURI = 91L;
    @GlobalConstant("NSXMLParserURIFragmentError")
    public static final long URIFragment = 92L;
    @GlobalConstant("NSXMLParserNoDTDError")
    public static final long NoDTD = 94L;
    @GlobalConstant("NSXMLParserDelegateAbortedParseError")
    public static final long DelegateAbortedParse = 512L;
    

}
