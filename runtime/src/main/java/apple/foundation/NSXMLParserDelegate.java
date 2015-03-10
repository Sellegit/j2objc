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





@Library("Foundation") @Mapping("NSXMLParserDelegate")
public interface NSXMLParserDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("parserDidStartDocument:")
    void didStartDocument(NSXMLParser parser);
    @Mapping("parserDidEndDocument:")
    void didEndDocument(NSXMLParser parser);
    @Mapping("parser:foundNotationDeclarationWithName:publicID:systemID:")
    void foundNotationDeclaration(NSXMLParser parser, String name, String publicID, String systemID);
    @Mapping("parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
    void foundUnparsedEntityDeclaration(NSXMLParser parser, String name, String publicID, String systemID, String notationName);
    @Mapping("parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
    void foundAttributeDeclaration(NSXMLParser parser, String attributeName, String elementName, String type, String defaultValue);
    @Mapping("parser:foundElementDeclarationWithName:model:")
    void foundElementDeclaration(NSXMLParser parser, String elementName, String model);
    @Mapping("parser:foundInternalEntityDeclarationWithName:value:")
    void foundInternalEntityDeclaration(NSXMLParser parser, String name, String value);
    @Mapping("parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
    void foundExternalEntityDeclaration(NSXMLParser parser, String name, String publicID, String systemID);
    @Mapping("parser:didStartElement:namespaceURI:qualifiedName:attributes:")
    void didStartElement(NSXMLParser parser, String elementName, String namespaceURI, String qName, Map<String, NSObject> attributeDict);
    @Mapping("parser:didEndElement:namespaceURI:qualifiedName:")
    void didEndElement(NSXMLParser parser, String elementName, String namespaceURI, String qName);
    @Mapping("parser:didStartMappingPrefix:toURI:")
    void didStartMappingPrefix(NSXMLParser parser, String prefix, String namespaceURI);
    @Mapping("parser:didEndMappingPrefix:")
    void didEndMappingPrefix(NSXMLParser parser, String prefix);
    @Mapping("parser:foundCharacters:")
    void foundCharacters(NSXMLParser parser, String string);
    @Mapping("parser:foundIgnorableWhitespace:")
    void foundIgnorableWhitespace(NSXMLParser parser, String whitespaceString);
    @Mapping("parser:foundProcessingInstructionWithTarget:data:")
    void foundProcessingInstruction(NSXMLParser parser, String target, String data);
    @Mapping("parser:foundComment:")
    void foundComment(NSXMLParser parser, String comment);
    @Mapping("parser:foundCDATA:")
    void foundCDATA(NSXMLParser parser, NSData CDATABlock);
    @Mapping("parser:resolveExternalEntityName:systemID:")
    NSData resolveExternalEntityName(NSXMLParser parser, String name, String systemID);
    @Mapping("parser:parseErrorOccurred:")
    void parseErrorOccurred(NSXMLParser parser, NSError parseError);
    @Mapping("parser:validationErrorOccurred:")
    void validationErrorOccurred(NSXMLParser parser, NSError validationError);
    
    /*<adapter>*/
    /*</adapter>*/
}
