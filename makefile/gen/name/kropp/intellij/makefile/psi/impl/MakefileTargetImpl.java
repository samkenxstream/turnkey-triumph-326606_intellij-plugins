// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.PsiTreeUtil;
import name.kropp.intellij.makefile.psi.*;
import name.kropp.intellij.makefile.stub.MakefileTargetStubElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MakefileTargetImpl extends MakefileTargetNamedElementImpl implements MakefileTarget {

  public MakefileTargetImpl(@NotNull ASTNode node) {
    super(node);
  }

  public MakefileTargetImpl(@NotNull MakefileTargetStubElement stub, @NotNull IStubElementType<?, ?> nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitTarget(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MakefileFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MakefileFunction.class);
  }

  @Override
  @NotNull
  public List<MakefileVariableUsage> getVariableUsageList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MakefileVariableUsage.class);
  }

  @Override
  @NotNull
  public String getName() {
    return MakefilePsiImplUtil.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return MakefilePsiImplUtil.setName(this, newName);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return MakefilePsiImplUtil.getNameIdentifier(this);
  }

  @Override
  @NotNull
  public ItemPresentation getPresentation() {
    return MakefilePsiImplUtil.getPresentation(this);
  }

  @Override
  public boolean isSpecialTarget() {
    return MakefilePsiImplUtil.isSpecialTarget(this);
  }

  @Override
  public boolean isPatternTarget() {
    return MakefilePsiImplUtil.isPatternTarget(this);
  }

  @Override
  public boolean matches(@NotNull String prerequisite) {
    return MakefilePsiImplUtil.matches(this, prerequisite);
  }

  @Override
  @Nullable
  public String getDocComment() {
    return MakefilePsiImplUtil.getDocComment(this);
  }

}
