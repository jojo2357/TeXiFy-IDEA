// This is a generated file. Not intended for manual editing.
package nl.hannahsten.texifyidea.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.PsiReference;
import com.intellij.psi.StubBasedPsiElement;
import nl.hannahsten.texifyidea.index.stub.LatexCommandsStub;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedHashMap;
import java.util.List;

public interface LatexCommands extends PsiNameIdentifierOwner, StubBasedPsiElement<LatexCommandsStub> {

  @NotNull
  List<LatexParameter> getParameterList();

  @NotNull
  PsiElement getCommandToken();

  @NotNull
  PsiReference[] getReferences();

  LinkedHashMap<String, String> getOptionalParameters();

  List<String> getRequiredParameters();

  boolean hasLabel();

  int getTextOffset();

  String getName();

}
