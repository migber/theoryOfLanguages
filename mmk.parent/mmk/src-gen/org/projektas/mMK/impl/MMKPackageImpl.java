/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.projektas.mMK.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.projektas.mMK.AbstractElement;
import org.projektas.mMK.Arithmetics;
import org.projektas.mMK.AssignmentExpression;
import org.projektas.mMK.Condition;
import org.projektas.mMK.ConditionalExpr;
import org.projektas.mMK.CreationExpression;
import org.projektas.mMK.ExprBody;
import org.projektas.mMK.Expression;
import org.projektas.mMK.FactorExpr;
import org.projektas.mMK.FactorExpression;
import org.projektas.mMK.GetLineExpression;
import org.projektas.mMK.GetNumExpression;
import org.projektas.mMK.MMKFactory;
import org.projektas.mMK.MMKPackage;
import org.projektas.mMK.Model;
import org.projektas.mMK.Operation;
import org.projektas.mMK.Primary;
import org.projektas.mMK.PrintExpression;
import org.projektas.mMK.Statement;
import org.projektas.mMK.UnaryExpression;
import org.projektas.mMK.Value;
import org.projektas.mMK.Variable;
import org.projektas.mMK.WhileExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MMKPackageImpl extends EPackageImpl implements MMKPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getLineExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getNumExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.projektas.mMK.MMKPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MMKPackageImpl()
  {
    super(eNS_URI, MMKFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MMKPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MMKPackage init()
  {
    if (isInited) return (MMKPackage)EPackage.Registry.INSTANCE.getEPackage(MMKPackage.eNS_URI);

    // Obtain or create and register package
    MMKPackageImpl theMMKPackage = (MMKPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MMKPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MMKPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMMKPackage.createPackageContents();

    // Initialize created meta-data
    theMMKPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMMKPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MMKPackage.eNS_URI, theMMKPackage);
    return theMMKPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetLineExpression()
  {
    return getLineExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetLineExpression_What()
  {
    return (EReference)getLineExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetNumExpression()
  {
    return getNumExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetNumExpression_What()
  {
    return (EReference)getNumExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrintExpression()
  {
    return printExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrintExpression_What()
  {
    return (EReference)printExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprBody()
  {
    return exprBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprBody_Expr()
  {
    return (EReference)exprBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactorExpression()
  {
    return factorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorExpression_L()
  {
    return (EReference)factorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorExpression_A()
  {
    return (EReference)factorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmetics()
  {
    return arithmeticsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArithmetics_M()
  {
    return (EAttribute)arithmeticsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArithmetics_R()
  {
    return (EReference)arithmeticsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimary()
  {
    return primaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactorExpr()
  {
    return factorExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorExpr_L()
  {
    return (EReference)factorExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorExpr_A()
  {
    return (EReference)factorExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_Val()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_Us()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValue_Var()
  {
    return (EReference)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValue_Val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreationExpression()
  {
    return creationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreationExpression_Type()
  {
    return (EAttribute)creationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreationExpression_Name()
  {
    return (EReference)creationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreationExpression_Val()
  {
    return (EReference)creationExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentExpression()
  {
    return assignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentExpression_Name()
  {
    return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentExpression_Val()
  {
    return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Cond()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Then()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_Else()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalExpr()
  {
    return conditionalExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalExpr_Left()
  {
    return (EReference)conditionalExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalExpr_Op()
  {
    return (EAttribute)conditionalExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalExpr_Right()
  {
    return (EReference)conditionalExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Params()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Type()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Body()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhileExpression()
  {
    return whileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileExpression_End()
  {
    return (EReference)whileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhileExpression_Loop()
  {
    return (EReference)whileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MMKFactory getMMKFactory()
  {
    return (MMKFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    statementEClass = createEClass(STATEMENT);

    expressionEClass = createEClass(EXPRESSION);

    getLineExpressionEClass = createEClass(GET_LINE_EXPRESSION);
    createEReference(getLineExpressionEClass, GET_LINE_EXPRESSION__WHAT);

    getNumExpressionEClass = createEClass(GET_NUM_EXPRESSION);
    createEReference(getNumExpressionEClass, GET_NUM_EXPRESSION__WHAT);

    printExpressionEClass = createEClass(PRINT_EXPRESSION);
    createEReference(printExpressionEClass, PRINT_EXPRESSION__WHAT);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    exprBodyEClass = createEClass(EXPR_BODY);
    createEReference(exprBodyEClass, EXPR_BODY__EXPR);

    factorExpressionEClass = createEClass(FACTOR_EXPRESSION);
    createEReference(factorExpressionEClass, FACTOR_EXPRESSION__L);
    createEReference(factorExpressionEClass, FACTOR_EXPRESSION__A);

    arithmeticsEClass = createEClass(ARITHMETICS);
    createEAttribute(arithmeticsEClass, ARITHMETICS__M);
    createEReference(arithmeticsEClass, ARITHMETICS__R);

    primaryEClass = createEClass(PRIMARY);

    factorExprEClass = createEClass(FACTOR_EXPR);
    createEReference(factorExprEClass, FACTOR_EXPR__L);
    createEReference(factorExprEClass, FACTOR_EXPR__A);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__VAL);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__US);

    valueEClass = createEClass(VALUE);
    createEReference(valueEClass, VALUE__VAR);
    createEAttribute(valueEClass, VALUE__VAL);

    creationExpressionEClass = createEClass(CREATION_EXPRESSION);
    createEAttribute(creationExpressionEClass, CREATION_EXPRESSION__TYPE);
    createEReference(creationExpressionEClass, CREATION_EXPRESSION__NAME);
    createEReference(creationExpressionEClass, CREATION_EXPRESSION__VAL);

    assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
    createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__NAME);
    createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__VAL);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__COND);
    createEReference(conditionEClass, CONDITION__THEN);
    createEReference(conditionEClass, CONDITION__ELSE);

    conditionalExprEClass = createEClass(CONDITIONAL_EXPR);
    createEReference(conditionalExprEClass, CONDITIONAL_EXPR__LEFT);
    createEAttribute(conditionalExprEClass, CONDITIONAL_EXPR__OP);
    createEReference(conditionalExprEClass, CONDITIONAL_EXPR__RIGHT);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEAttribute(operationEClass, OPERATION__PARAMS);
    createEAttribute(operationEClass, OPERATION__TYPE);
    createEReference(operationEClass, OPERATION__BODY);

    whileExpressionEClass = createEClass(WHILE_EXPRESSION);
    createEReference(whileExpressionEClass, WHILE_EXPRESSION__END);
    createEReference(whileExpressionEClass, WHILE_EXPRESSION__LOOP);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    statementEClass.getESuperTypes().add(this.getAbstractElement());
    expressionEClass.getESuperTypes().add(this.getStatement());
    getLineExpressionEClass.getESuperTypes().add(this.getExpression());
    getNumExpressionEClass.getESuperTypes().add(this.getExpression());
    printExpressionEClass.getESuperTypes().add(this.getExpression());
    factorExprEClass.getESuperTypes().add(this.getPrimary());
    unaryExpressionEClass.getESuperTypes().add(this.getExpression());
    unaryExpressionEClass.getESuperTypes().add(this.getPrimary());
    creationExpressionEClass.getESuperTypes().add(this.getExpression());
    assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
    conditionEClass.getESuperTypes().add(this.getAbstractElement());
    operationEClass.getESuperTypes().add(this.getAbstractElement());
    whileExpressionEClass.getESuperTypes().add(this.getAbstractElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(getLineExpressionEClass, GetLineExpression.class, "GetLineExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGetLineExpression_What(), this.getValue(), null, "what", null, 0, 1, GetLineExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getNumExpressionEClass, GetNumExpression.class, "GetNumExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGetNumExpression_What(), this.getValue(), null, "what", null, 0, 1, GetNumExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printExpressionEClass, PrintExpression.class, "PrintExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrintExpression_What(), this.getValue(), null, "what", null, 0, 1, PrintExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprBodyEClass, ExprBody.class, "ExprBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprBody_Expr(), this.getFactorExpression(), null, "expr", null, 0, -1, ExprBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorExpressionEClass, FactorExpression.class, "FactorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactorExpression_L(), this.getPrimary(), null, "l", null, 0, 1, FactorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactorExpression_A(), this.getArithmetics(), null, "a", null, 0, -1, FactorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arithmeticsEClass, Arithmetics.class, "Arithmetics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArithmetics_M(), ecorePackage.getEString(), "m", null, 0, 1, Arithmetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArithmetics_R(), this.getPrimary(), null, "r", null, 0, 1, Arithmetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryEClass, Primary.class, "Primary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(factorExprEClass, FactorExpr.class, "FactorExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactorExpr_L(), this.getPrimary(), null, "l", null, 0, 1, FactorExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactorExpr_A(), this.getArithmetics(), null, "a", null, 0, -1, FactorExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryExpression_Val(), this.getValue(), null, "val", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnaryExpression_Us(), ecorePackage.getEString(), "us", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValue_Var(), this.getVariable(), null, "var", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValue_Val(), ecorePackage.getEString(), "val", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creationExpressionEClass, CreationExpression.class, "CreationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreationExpression_Type(), ecorePackage.getEString(), "type", null, 0, 1, CreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreationExpression_Name(), this.getVariable(), null, "name", null, 0, 1, CreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreationExpression_Val(), this.getExprBody(), null, "val", null, 0, 1, CreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentExpression_Name(), this.getVariable(), null, "name", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentExpression_Val(), this.getExprBody(), null, "val", null, 0, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_Cond(), this.getConditionalExpr(), null, "cond", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Then(), this.getAbstractElement(), null, "then", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_Else(), this.getAbstractElement(), null, "else", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalExprEClass, ConditionalExpr.class, "ConditionalExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalExpr_Left(), this.getExprBody(), null, "left", null, 0, 1, ConditionalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalExpr_Op(), ecorePackage.getEString(), "op", null, 0, 1, ConditionalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalExpr_Right(), this.getExprBody(), null, "right", null, 0, 1, ConditionalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Params(), ecorePackage.getEString(), "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Type(), ecorePackage.getEString(), "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Body(), this.getExpression(), null, "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileExpressionEClass, WhileExpression.class, "WhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhileExpression_End(), this.getConditionalExpr(), null, "end", null, 0, 1, WhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileExpression_Loop(), this.getAbstractElement(), null, "loop", null, 0, -1, WhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MMKPackageImpl
