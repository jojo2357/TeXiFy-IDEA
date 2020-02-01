// This is a generated file. Not intended for manual editing.
package nl.hannahsten.texifyidea.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import nl.hannahsten.texifyidea.index.stub.LatexEnvironmentStub;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LatexEnvironment extends PsiElement, StubBasedPsiElement<LatexEnvironmentStub> {

  @NotNull
  LatexBeginCommand getBeginCommand();

  @Nullable
  LatexEndCommand getEndCommand();

  @Nullable
  LatexEnvironmentContent getEnvironmentContent();

  String getEnvironmentName();

  boolean hasLabel();

}