/*
* generated by Xtext
*/
package itu.dk.aamj.intentdsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import itu.dk.aamj.intentdsl.services.IntentDslGrammarAccess;

public class IntentDslParser extends AbstractContentAssistParser {
	
	@Inject
	private IntentDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal.InternalIntentDslParser createParser() {
		itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal.InternalIntentDslParser result = new itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal.InternalIntentDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBundleAccess().getAlternatives(), "rule__Bundle__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getIntent_ImplAccess().getGroup(), "rule__Intent_Impl__Group__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_4(), "rule__Intent_Impl__Group_4__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_5(), "rule__Intent_Impl__Group_5__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_6(), "rule__Intent_Impl__Group_6__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_7(), "rule__Intent_Impl__Group_7__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_7_3(), "rule__Intent_Impl__Group_7_3__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_8(), "rule__Intent_Impl__Group_8__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_9(), "rule__Intent_Impl__Group_9__0");
					put(grammarAccess.getIntent_ImplAccess().getGroup_9_3(), "rule__Intent_Impl__Group_9_3__0");
					put(grammarAccess.getBundle_ImplAccess().getGroup(), "rule__Bundle_Impl__Group__0");
					put(grammarAccess.getCallbackAccess().getGroup(), "rule__Callback__Group__0");
					put(grammarAccess.getCallbackAccess().getGroup_4(), "rule__Callback__Group_4__0");
					put(grammarAccess.getPermissionsAccess().getGroup(), "rule__Permissions__Group__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup(), "rule__ExplicitIntent__Group__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_3(), "rule__ExplicitIntent__Group_3__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_4(), "rule__ExplicitIntent__Group_4__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_5(), "rule__ExplicitIntent__Group_5__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_8(), "rule__ExplicitIntent__Group_8__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_8_3(), "rule__ExplicitIntent__Group_8_3__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_9(), "rule__ExplicitIntent__Group_9__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_10(), "rule__ExplicitIntent__Group_10__0");
					put(grammarAccess.getExplicitIntentAccess().getGroup_10_3(), "rule__ExplicitIntent__Group_10_3__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup(), "rule__ImplicitIntent__Group__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_3(), "rule__ImplicitIntent__Group_3__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_4(), "rule__ImplicitIntent__Group_4__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_5(), "rule__ImplicitIntent__Group_5__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_6(), "rule__ImplicitIntent__Group_6__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_9(), "rule__ImplicitIntent__Group_9__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_9_3(), "rule__ImplicitIntent__Group_9_3__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_10(), "rule__ImplicitIntent__Group_10__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_11(), "rule__ImplicitIntent__Group_11__0");
					put(grammarAccess.getImplicitIntentAccess().getGroup_11_3(), "rule__ImplicitIntent__Group_11_3__0");
					put(grammarAccess.getDoubleExtraAccess().getGroup(), "rule__DoubleExtra__Group__0");
					put(grammarAccess.getIntExtraAccess().getGroup(), "rule__IntExtra__Group__0");
					put(grammarAccess.getCharSequenceExtraAccess().getGroup(), "rule__CharSequenceExtra__Group__0");
					put(grammarAccess.getCharExtraAccess().getGroup(), "rule__CharExtra__Group__0");
					put(grammarAccess.getBundleExtraAccess().getGroup(), "rule__BundleExtra__Group__0");
					put(grammarAccess.getParceableExtraAccess().getGroup(), "rule__ParceableExtra__Group__0");
					put(grammarAccess.getSerializableExtraAccess().getGroup(), "rule__SerializableExtra__Group__0");
					put(grammarAccess.getFloatExtraAccess().getGroup(), "rule__FloatExtra__Group__0");
					put(grammarAccess.getByteExtraAccess().getGroup(), "rule__ByteExtra__Group__0");
					put(grammarAccess.getLongExtraAccess().getGroup(), "rule__LongExtra__Group__0");
					put(grammarAccess.getStringExtraAccess().getGroup(), "rule__StringExtra__Group__0");
					put(grammarAccess.getIntent_ImplAccess().getNameAssignment_2(), "rule__Intent_Impl__NameAssignment_2");
					put(grammarAccess.getIntent_ImplAccess().getTypeAssignment_4_1(), "rule__Intent_Impl__TypeAssignment_4_1");
					put(grammarAccess.getIntent_ImplAccess().getDataAssignment_5_1(), "rule__Intent_Impl__DataAssignment_5_1");
					put(grammarAccess.getIntent_ImplAccess().getExceptionNameAssignment_6_1(), "rule__Intent_Impl__ExceptionNameAssignment_6_1");
					put(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_2(), "rule__Intent_Impl__ExtrasAssignment_7_2");
					put(grammarAccess.getIntent_ImplAccess().getExtrasAssignment_7_3_1(), "rule__Intent_Impl__ExtrasAssignment_7_3_1");
					put(grammarAccess.getIntent_ImplAccess().getSucessCallbackAssignment_8_1(), "rule__Intent_Impl__SucessCallbackAssignment_8_1");
					put(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_2(), "rule__Intent_Impl__PermissionsAssignment_9_2");
					put(grammarAccess.getIntent_ImplAccess().getPermissionsAssignment_9_3_1(), "rule__Intent_Impl__PermissionsAssignment_9_3_1");
					put(grammarAccess.getBundle_ImplAccess().getNameAssignment_1(), "rule__Bundle_Impl__NameAssignment_1");
					put(grammarAccess.getBundle_ImplAccess().getValueAssignment_4(), "rule__Bundle_Impl__ValueAssignment_4");
					put(grammarAccess.getCallbackAccess().getNameAssignment_2(), "rule__Callback__NameAssignment_2");
					put(grammarAccess.getCallbackAccess().getDataAssignment_4_1(), "rule__Callback__DataAssignment_4_1");
					put(grammarAccess.getPermissionsAccess().getNameAssignment_2(), "rule__Permissions__NameAssignment_2");
					put(grammarAccess.getExplicitIntentAccess().getNameAssignment_1(), "rule__ExplicitIntent__NameAssignment_1");
					put(grammarAccess.getExplicitIntentAccess().getTypeAssignment_3_1(), "rule__ExplicitIntent__TypeAssignment_3_1");
					put(grammarAccess.getExplicitIntentAccess().getDataAssignment_4_1(), "rule__ExplicitIntent__DataAssignment_4_1");
					put(grammarAccess.getExplicitIntentAccess().getExceptionNameAssignment_5_1(), "rule__ExplicitIntent__ExceptionNameAssignment_5_1");
					put(grammarAccess.getExplicitIntentAccess().getComponentAssignment_7(), "rule__ExplicitIntent__ComponentAssignment_7");
					put(grammarAccess.getExplicitIntentAccess().getExtrasAssignment_8_2(), "rule__ExplicitIntent__ExtrasAssignment_8_2");
					put(grammarAccess.getExplicitIntentAccess().getExtrasAssignment_8_3_1(), "rule__ExplicitIntent__ExtrasAssignment_8_3_1");
					put(grammarAccess.getExplicitIntentAccess().getSucessCallbackAssignment_9_1(), "rule__ExplicitIntent__SucessCallbackAssignment_9_1");
					put(grammarAccess.getExplicitIntentAccess().getPermissionsAssignment_10_2(), "rule__ExplicitIntent__PermissionsAssignment_10_2");
					put(grammarAccess.getExplicitIntentAccess().getPermissionsAssignment_10_3_1(), "rule__ExplicitIntent__PermissionsAssignment_10_3_1");
					put(grammarAccess.getImplicitIntentAccess().getNameAssignment_1(), "rule__ImplicitIntent__NameAssignment_1");
					put(grammarAccess.getImplicitIntentAccess().getTypeAssignment_3_1(), "rule__ImplicitIntent__TypeAssignment_3_1");
					put(grammarAccess.getImplicitIntentAccess().getDataAssignment_4_1(), "rule__ImplicitIntent__DataAssignment_4_1");
					put(grammarAccess.getImplicitIntentAccess().getExceptionNameAssignment_5_1(), "rule__ImplicitIntent__ExceptionNameAssignment_5_1");
					put(grammarAccess.getImplicitIntentAccess().getCategoryAssignment_6_1(), "rule__ImplicitIntent__CategoryAssignment_6_1");
					put(grammarAccess.getImplicitIntentAccess().getActionAssignment_8(), "rule__ImplicitIntent__ActionAssignment_8");
					put(grammarAccess.getImplicitIntentAccess().getExtrasAssignment_9_2(), "rule__ImplicitIntent__ExtrasAssignment_9_2");
					put(grammarAccess.getImplicitIntentAccess().getExtrasAssignment_9_3_1(), "rule__ImplicitIntent__ExtrasAssignment_9_3_1");
					put(grammarAccess.getImplicitIntentAccess().getSucessCallbackAssignment_10_1(), "rule__ImplicitIntent__SucessCallbackAssignment_10_1");
					put(grammarAccess.getImplicitIntentAccess().getPermissionsAssignment_11_2(), "rule__ImplicitIntent__PermissionsAssignment_11_2");
					put(grammarAccess.getImplicitIntentAccess().getPermissionsAssignment_11_3_1(), "rule__ImplicitIntent__PermissionsAssignment_11_3_1");
					put(grammarAccess.getDoubleExtraAccess().getNameAssignment_1(), "rule__DoubleExtra__NameAssignment_1");
					put(grammarAccess.getDoubleExtraAccess().getValueAssignment_4(), "rule__DoubleExtra__ValueAssignment_4");
					put(grammarAccess.getIntExtraAccess().getNameAssignment_1(), "rule__IntExtra__NameAssignment_1");
					put(grammarAccess.getIntExtraAccess().getValueAssignment_4(), "rule__IntExtra__ValueAssignment_4");
					put(grammarAccess.getCharSequenceExtraAccess().getNameAssignment_1(), "rule__CharSequenceExtra__NameAssignment_1");
					put(grammarAccess.getCharSequenceExtraAccess().getValueAssignment_4(), "rule__CharSequenceExtra__ValueAssignment_4");
					put(grammarAccess.getCharExtraAccess().getNameAssignment_1(), "rule__CharExtra__NameAssignment_1");
					put(grammarAccess.getCharExtraAccess().getValueAssignment_4(), "rule__CharExtra__ValueAssignment_4");
					put(grammarAccess.getBundleExtraAccess().getNameAssignment_1(), "rule__BundleExtra__NameAssignment_1");
					put(grammarAccess.getBundleExtraAccess().getValueAssignment_4(), "rule__BundleExtra__ValueAssignment_4");
					put(grammarAccess.getParceableExtraAccess().getNameAssignment_1(), "rule__ParceableExtra__NameAssignment_1");
					put(grammarAccess.getParceableExtraAccess().getValueAssignment_4(), "rule__ParceableExtra__ValueAssignment_4");
					put(grammarAccess.getSerializableExtraAccess().getNameAssignment_1(), "rule__SerializableExtra__NameAssignment_1");
					put(grammarAccess.getSerializableExtraAccess().getValueAssignment_4(), "rule__SerializableExtra__ValueAssignment_4");
					put(grammarAccess.getFloatExtraAccess().getNameAssignment_1(), "rule__FloatExtra__NameAssignment_1");
					put(grammarAccess.getFloatExtraAccess().getValueAssignment_4(), "rule__FloatExtra__ValueAssignment_4");
					put(grammarAccess.getByteExtraAccess().getNameAssignment_1(), "rule__ByteExtra__NameAssignment_1");
					put(grammarAccess.getByteExtraAccess().getValueAssignment_4(), "rule__ByteExtra__ValueAssignment_4");
					put(grammarAccess.getLongExtraAccess().getNameAssignment_1(), "rule__LongExtra__NameAssignment_1");
					put(grammarAccess.getLongExtraAccess().getValueAssignment_4(), "rule__LongExtra__ValueAssignment_4");
					put(grammarAccess.getStringExtraAccess().getNameAssignment_1(), "rule__StringExtra__NameAssignment_1");
					put(grammarAccess.getStringExtraAccess().getValueAssignment_4(), "rule__StringExtra__ValueAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal.InternalIntentDslParser typedParser = (itu.dk.aamj.intentdsl.ui.contentassist.antlr.internal.InternalIntentDslParser) parser;
			typedParser.entryRuleIntent_Impl();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IntentDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IntentDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}